import sys, Ice
import player
import vlc
import time
import signal

class PrinterI(player.Streamer):
	vlc_instance = None
	vlc_player = None
	options = None
	boolean =True;
	def printString(self, s, current=None):
		print s

	def launchFlux(self, url,duration,current=None):
		"""Cree le flux sur le port 8555
		"""
		self.vlc_instance = vlc.Instance()
		self.vlc_player = self.vlc_instance.media_player_new()
		options = 'sout=#transcode{vcodec=h264,acodec=mpga,ab=128,channels=2,samplerate=44100}:rtp{sdp=rtsp://:8555/}'
		media = self.vlc_instance.media_new(url,options)
		print "Streaming of "+url +"is launched"
		self.vlc_player.set_media(media)
		self.vlc_player.play()


	def stopFlux(self,current=None):
		"""Stop le flux
		"""
		self.vlc_player.stop()
		self.vlc_instance.vlm_release()
		print "Streaming  released"




with Ice.initialize(sys.argv) as communicator:
	print "Streamer running on :1234"
	adapter = communicator.createObjectAdapterWithEndpoints("SimpleStreamerAdapter", "default -p 1234")
	object = PrinterI()
	adapter.add(object, communicator.stringToIdentity("SimpleStreamer"))
	adapter.activate()
	communicator.waitForShutdown()

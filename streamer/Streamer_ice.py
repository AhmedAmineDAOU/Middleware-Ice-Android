# -*- coding: utf-8 -*-
# **********************************************************************
#
# Copyright (c) 2003-2018 ZeroC, Inc. All rights reserved.
#
# This copy of Ice is licensed to you under the terms described in the
# ICE_LICENSE file included in this distribution.
#
# **********************************************************************
#
# Ice version 3.7.1
#
# <auto-generated>
#
# Generated from file `Streamer.ice'
#
# Warning: do not edit this file.
#
# </auto-generated>
#

from sys import version_info as _version_info_
import Ice, IcePy

# Start of module player
_M_player = Ice.openModule('player')
__name__ = 'player'

_M_player._t_Streamer = IcePy.defineValue('::player::Streamer', Ice.Value, -1, (), False, True, None, ())

if 'StreamerPrx' not in _M_player.__dict__:
    _M_player.StreamerPrx = Ice.createTempClass()
    class StreamerPrx(Ice.ObjectPrx):

        def printString(self, s, context=None):
            return _M_player.Streamer._op_printString.invoke(self, ((s, ), context))

        def printStringAsync(self, s, context=None):
            return _M_player.Streamer._op_printString.invokeAsync(self, ((s, ), context))

        def begin_printString(self, s, _response=None, _ex=None, _sent=None, context=None):
            return _M_player.Streamer._op_printString.begin(self, ((s, ), _response, _ex, _sent, context))

        def end_printString(self, _r):
            return _M_player.Streamer._op_printString.end(self, _r)

        def launchFlux(self, url, duration, context=None):
            return _M_player.Streamer._op_launchFlux.invoke(self, ((url, duration), context))

        def launchFluxAsync(self, url, duration, context=None):
            return _M_player.Streamer._op_launchFlux.invokeAsync(self, ((url, duration), context))

        def begin_launchFlux(self, url, duration, _response=None, _ex=None, _sent=None, context=None):
            return _M_player.Streamer._op_launchFlux.begin(self, ((url, duration), _response, _ex, _sent, context))

        def end_launchFlux(self, _r):
            return _M_player.Streamer._op_launchFlux.end(self, _r)

        def stopFlux(self, context=None):
            return _M_player.Streamer._op_stopFlux.invoke(self, ((), context))

        def stopFluxAsync(self, context=None):
            return _M_player.Streamer._op_stopFlux.invokeAsync(self, ((), context))

        def begin_stopFlux(self, _response=None, _ex=None, _sent=None, context=None):
            return _M_player.Streamer._op_stopFlux.begin(self, ((), _response, _ex, _sent, context))

        def end_stopFlux(self, _r):
            return _M_player.Streamer._op_stopFlux.end(self, _r)

        @staticmethod
        def checkedCast(proxy, facetOrContext=None, context=None):
            return _M_player.StreamerPrx.ice_checkedCast(proxy, '::player::Streamer', facetOrContext, context)

        @staticmethod
        def uncheckedCast(proxy, facet=None):
            return _M_player.StreamerPrx.ice_uncheckedCast(proxy, facet)

        @staticmethod
        def ice_staticId():
            return '::player::Streamer'
    _M_player._t_StreamerPrx = IcePy.defineProxy('::player::Streamer', StreamerPrx)

    _M_player.StreamerPrx = StreamerPrx
    del StreamerPrx

    _M_player.Streamer = Ice.createTempClass()
    class Streamer(Ice.Object):

        def ice_ids(self, current=None):
            return ('::Ice::Object', '::player::Streamer')

        def ice_id(self, current=None):
            return '::player::Streamer'

        @staticmethod
        def ice_staticId():
            return '::player::Streamer'

        def printString(self, s, current=None):
            raise NotImplementedError("servant method 'printString' not implemented")

        def launchFlux(self, url, duration, current=None):
            raise NotImplementedError("servant method 'launchFlux' not implemented")

        def stopFlux(self, current=None):
            raise NotImplementedError("servant method 'stopFlux' not implemented")

        def __str__(self):
            return IcePy.stringify(self, _M_player._t_StreamerDisp)

        __repr__ = __str__

    _M_player._t_StreamerDisp = IcePy.defineClass('::player::Streamer', Streamer, (), None, ())
    Streamer._ice_type = _M_player._t_StreamerDisp

    Streamer._op_printString = IcePy.Operation('printString', Ice.OperationMode.Normal, Ice.OperationMode.Normal, False, None, (), (((), IcePy._t_string, False, 0),), (), None, ())
    Streamer._op_launchFlux = IcePy.Operation('launchFlux', Ice.OperationMode.Normal, Ice.OperationMode.Normal, False, None, (), (((), IcePy._t_string, False, 0), ((), IcePy._t_int, False, 0)), (), None, ())
    Streamer._op_stopFlux = IcePy.Operation('stopFlux', Ice.OperationMode.Normal, Ice.OperationMode.Normal, False, None, (), (), (), None, ())

    _M_player.Streamer = Streamer
    del Streamer

# End of module player
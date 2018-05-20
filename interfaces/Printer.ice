module Demo
{
	struct music {
		string id;
		string name;
		string author;
		string album;
		string genre;
		string url;
		int minutes;
		int seconds;
		int fav;
	};
	sequence <music> listmusic;
	sequence <byte> cover;
    interface Printer
    {
        string printString(string s);
        listmusic findByName(string songName);
		listmusic findAllMusics();
        listmusic findByAuth(string authorName);
        listmusic findByAlbum(string albumName);
        listmusic findByGenre(string genre);
		music getMusicByName(string name);
		cover getCoverByMusic(string path);
		void addToFavorites(string songname);
		void removeFromFavorites(string songname);
    };
}

import java.util.*;
import java.sql.*;
import Demo.music;
import com.mpatric.mp3agic.*;
import java.awt.image.BufferedImage;
import java.io.*;
import     java.lang.Process ;
import javax.imageio.ImageIO ;

public class PrinterI implements Demo.Printer
{
/**
 * fonction de test
 * @param  s      chaine a afficher
 * @param  current Adapter
 * @return         chaine
 */
    public String printString(String s, com.zeroc.Ice.Current current)
    {
    	System.out.println("hello");
        return s;
    }
		/**
		 * fonction de recherche par nom
		 * peux envoyer plusieurs chansons ayant un nom qui ressemble a une chaine passée en parametre
		 * @param  nameSong parametre de la recherche
		 * @param  current Object Adapter
		 * @return          un tableau de music
		 */
    public music[] findByName(String nameSong, com.zeroc.Ice.Current current){
    	nameSong=nameSong.toLowerCase();
    	 Connection c = null;
    	int count=0;
  	 	Statement stmt = null;
    	music[] m=new music[30];
    	int min=0,sec=0,fav=0;
      String  id="",name="" ,author="",album="",genre="" ,url="" ;
      ResultSet rs;

    	  try {
      				Class.forName("org.sqlite.JDBC");
      				c = DriverManager.getConnection("jdbc:sqlite:music.db");
     					c.setAutoCommit(false);
      				System.out.println("Opened database successfully");
     					stmt = c.createStatement();
      				rs = stmt.executeQuery( "SELECT * FROM MUSIC WHERE lower(name) LIKE '%"+nameSong+"%';" );
      				while ( rs.next() ) {

         					id = rs.getString("id");
        					name   = rs.getString("name");
         					author = rs.getString("author");
         					album  = rs.getString("album");
         					genre  = rs.getString("genre");
        					url    = rs.getString("url");
         					min    = rs.getInt("minutes");
         					sec    = rs.getInt("seconds");
                  fav    = rs.getInt("fav");
      						music musicfile=new music(id,name,author,album,genre,url,min,sec,fav);
                  m[count]=musicfile;
                  count++;
         					System.out.println( "ID = " + id );
         					System.out.println( "NAME = " + name );
        					 System.out.println( "Album = " + album );
        					 System.out.println( "Genre = " + genre );
        					 System.out.println( "Url = " + url );
       					 	 System.out.println( "Minutes = " + min );
        					 System.out.println( "Seconds " + sec );
                   System.out.println( "fav " + fav );
         				}
      				rs.close();
      				stmt.close();
      				c.close();
   				} catch ( Exception e ) {
    				System.out.println("get songs by name="+nameSong+" failed");
      		 		System.exit(0);
  							}
    				System.out.println("get songs by name="+nameSong+" done succesfully\n"+count +" the song was found");
    			return m;
    }
		/**
		 * fonction qui envoie une et une seule musique correnpendant au nom passé en parametre
		 * @param  nameSong parametre
		 * @param  current  Object Adapter
		 * @return          une seule musique
		 */
    public music getMusicByName(String nameSong, com.zeroc.Ice.Current current){
    	nameSong=nameSong.toLowerCase();
    	 Connection c = null;
    	int count=0;
  	 	Statement stmt = null;
    	music musicfile=new music();
    	int min=0,sec=0,fav=0;
        String  id ="",name="" ,author="",album="",genre="" ,url="" ;
        ResultSet rs;

    	  try {
      				Class.forName("org.sqlite.JDBC");
      				c = DriverManager.getConnection("jdbc:sqlite:music.db");
     					c.setAutoCommit(false);
      				System.out.println("Opened database successfully");
     					stmt = c.createStatement();
      				rs = stmt.executeQuery( "SELECT * FROM MUSIC WHERE lower(name) LIKE '"+nameSong+"';" );

      				while ( rs.next() ) {
         					id = rs.getString("id");
        					name   = rs.getString("name");
         					author = rs.getString("author");
         					album  = rs.getString("album");
         					genre  = rs.getString("genre");
        					url    = rs.getString("url");
         					min    = rs.getInt("minutes");
         					sec    = rs.getInt("seconds");
                  fav    = rs.getInt("fav");
      						musicfile=new music(id,name,author,album,genre,url,min,sec,fav);

         					System.out.println( "ID = " + id );
         					System.out.println( "NAME = " + name );
        					System.out.println( "Album = " + album );
        					System.out.println( "Genre = " + genre );
        					System.out.println( "Url = " + url );
       					 	System.out.println( "Minutes = " + min );
        					System.out.println( "Seconds " + sec );
                  System.out.println( "fav " + fav );
         				}
      				rs.close();
      				stmt.close();
      				c.close();
   				} catch ( Exception e ) {
    				System.out.println("get songs by name="+nameSong+" failed");
      		 	System.exit(0);
  							}
    				System.out.println("get songs by name="+nameSong+" done succesfully\n"+count +" the song was found");
    				return musicfile;
    }
		/**
		 * Retourne les chanson d'un author passé en param
		 * @param  nameAuthor nom de l'auteur
		 * @param  current    Object Adapter
		 * @return           tableau de music
		 */
    public music[] findByAuth(String nameAuthor, com.zeroc.Ice.Current current){
    	nameAuthor=nameAuthor.toLowerCase();
    	 Connection c = null;
    	int count=0;
  	 	Statement stmt = null;
    	music[] m=new music[30];
    	int min=0,sec=0,fav=0;
        String  id="",name="" ,author="",album="",genre="" ,url="" ;
        ResultSet rs;

    	  try {
      				Class.forName("org.sqlite.JDBC");
      				c = DriverManager.getConnection("jdbc:sqlite:music.db");
     				c.setAutoCommit(false);
      				System.out.println("Opened database successfully");
     				stmt = c.createStatement();
      				rs = stmt.executeQuery( "SELECT * FROM MUSIC WHERE lower(author) LIKE '%"+nameAuthor+"%';" );

      				while ( rs.next() ) {

         					id = rs.getString("id");
        					name   = rs.getString("name");
         					author = rs.getString("author");
         					album  = rs.getString("album");
         					genre  = rs.getString("genre");
        					url    = rs.getString("url");
         					min    = rs.getInt("minutes");
         					sec    = rs.getInt("seconds");
                  fav    = rs.getInt("fav");
      						music musicfile=new music(id,name,author,album,genre,url,min,sec,fav);
      						m[count]=musicfile;
         					count++;
         					System.out.println( "ID = " + id );
         					System.out.println( "NAME = " + name );
        					 System.out.println( "Album = " + album );
        					 System.out.println( "Genre = " + genre );
        					 System.out.println( "Url = " + url );
       					 	 System.out.println( "Minutes = " + min );
        					 System.out.println( "Seconds " + sec );
                  System.out.println( "fav " + fav );
         				}
      				rs.close();
      				stmt.close();
      				c.close();
   				} catch ( Exception e ) {
    				System.out.println("get songs by author="+nameAuthor+" failed");
      		 	System.exit(0);
  							}
    				System.out.println("get songs by author="+nameAuthor+" done succesfully\n"+count +" songs were found");
    			return m;
    }
		/**
		 * Retourne les chanson d'un album passé en param
		 * @param  nameAlbum nom de l'album
		 * @param  current    Object Adapter
		 * @return           tableau de music
		 */
    public music[] findByAlbum(String nameAlbum, com.zeroc.Ice.Current current){
    	nameAlbum=nameAlbum.toLowerCase();
	Connection c = null;
    	int count=0;
  	 	Statement stmt = null;
    	music[] m=new music[30];
    	int min=0,sec=0,fav=0;
        String id="", name="" ,author="",album="",genre="" ,url="" ;
        ResultSet rs;

    	  try {
      				Class.forName("org.sqlite.JDBC");
      				c = DriverManager.getConnection("jdbc:sqlite:music.db");
     				c.setAutoCommit(false);
      				System.out.println("Opened database successfully");
     				stmt = c.createStatement();
      				rs = stmt.executeQuery( "SELECT * FROM MUSIC WHERE lower(ALBUM) LIKE '%"+nameAlbum+"%';" );

      				while ( rs.next() ) {

         					id = rs.getString("id");
        					name   = rs.getString("name");
         					author = rs.getString("author");
         					album  = rs.getString("album");
         					genre  = rs.getString("genre");
        					url    = rs.getString("url");
         					min    = rs.getInt("minutes");
         					sec    = rs.getInt("seconds");
                  fav    = rs.getInt("fav");

      						music musicfile=new music(id,name,author,album,genre,url,min,sec,fav);
      						m[count]=musicfile;
         					count++;
         					System.out.println( "ID = " + id );
         					System.out.println( "NAME = " + name );
        					 System.out.println( "Album = " + album );
        					 System.out.println( "Genre = " + genre );
        					 System.out.println( "Url = " + url );
       					 	 System.out.println( "Minutes = " + min );
        					 System.out.println( "Seconds " + sec );
                  System.out.println( "fav " + fav );


         				}
      				rs.close();
      				stmt.close();
      				c.close();
   				} catch ( Exception e ) {
    				System.out.println("get songs by album="+nameAlbum+" failed");
      		 		System.exit(0);
  							}
    				System.out.println("get songs by album="+nameAlbum+" done succesfully\n"+count +" songs were found");
    			return m;
   				}
/**
 * nom implementé , non utilisée
 * @param  nameGenre [description]
 * @param  current   [description]
 * @return           [description]
 */
    public music[] findByGenre(String nameGenre, com.zeroc.Ice.Current current){

    	  music[] a = new music[1];
    	return a ;
    }
		/**
		 * retourne toute les musique de la base de donnée
		 * @param  current [description]
		 * @return         [description]
		 */
    public music[] findAllMusics(com.zeroc.Ice.Current current){
    	Connection c = null;
    	int count=0;
  	 	Statement stmt = null;
    	music[] m=new music[30];
    	int min=0,sec=0,fav=0;
        String id="", name="" ,author="",album="",genre="" ,url="" ;
        ResultSet rs;

    	  try {
      				Class.forName("org.sqlite.JDBC");
      				c = DriverManager.getConnection("jdbc:sqlite:music.db");
     					c.setAutoCommit(false);
      				System.out.println("Opened database successfully");
     					stmt = c.createStatement();
      				rs = stmt.executeQuery( "SELECT * FROM MUSIC;" );

      				while ( rs.next() ) {

         					id = rs.getString("id");
        					name   = rs.getString("name");
         					author = rs.getString("author");
         					album  = rs.getString("album");
         					genre  = rs.getString("genre");
        					url    = rs.getString("url");
         					min    = rs.getInt("minutes");
         					sec    = rs.getInt("seconds");
                  fav    = rs.getInt("fav");
      						music musicfile=new music(id,name,author,album,genre,url,min,sec,fav);
      						m[count]=musicfile;
         					count++;
         				}
      				rs.close();
      				stmt.close();
      				c.close();
   				} catch ( Exception e ) {
    				System.out.println("get all songs failed");
      		 		System.exit(0);
  							}
    			System.out.println("get all "+count+" songs done successfully");
					System.out.println(count);

    			return m;
   				}
					/**
					 * recuperer le artwork d'un musique et le transformé
					 * en byte[] pour qu'il soit pris en charge par ice
					 * en tant que sequence<byte> tel que mis dans l'interface ice
					 * @param  path    chemin de la chanson sur le disque
					 * @param  current
					 * @return
					 */
        public  byte[] getCoverByMusic(String path,com.zeroc.Ice.Current current){

            String filename=path;
            try{
              Mp3File song = new Mp3File(filename);
              if (song.hasId3v2Tag()){

                ID3v2 id3v2tag = song.getId3v2Tag();
                byte[] imageData = id3v2tag.getAlbumImage();

                return imageData;
                }
                }catch(IOException e){
                  e.printStackTrace();

                }catch(UnsupportedTagException e){
                  e.printStackTrace();

                }catch(InvalidDataException e){
                  e.printStackTrace();
                  }
                  return null;
                }
								/**
								 * requete update pour ajouter une chansons au favories
								 * @param songname
								 * @param current
								 */
          public void addToFavorites(String songname,com.zeroc.Ice.Current current){
                songname=songname.toLowerCase();
                Connection c = null;
                int count=0;
                Statement stmt = null;
                 music[] m=new music[30];
                int min=0,sec=0,fav=0;
                String id="", name="" ,author="",album="",genre="" ,url="" ;
                ResultSet rs;

              try {
                Class.forName("org.sqlite.JDBC");
                c = DriverManager.getConnection("jdbc:sqlite:music.db");
                c.setAutoCommit(false);
                System.out.println("Opened database successfully");
                stmt = c.createStatement();
                String sql = "UPDATE MUSIC set FAV = 1 where lower(name) LIKE '"+songname+"';";
                stmt.executeUpdate(sql);
                c.commit();
                System.out.println("song "+songname+" added to favorites successfully");
              }catch(Exception e){
                e.printStackTrace();
               }
           }

					 /**
					  * requete update pour enleve un chanson des favorites
					  * @param songname
					  * @param current
					  */
         public void removeFromFavorites(String songname,com.zeroc.Ice.Current current){
             songname=songname.toLowerCase();
                Connection c = null;
                int count=0;
                Statement stmt = null;
                 music[] m=new music[30];
                int min=0,sec=0,fav=0;
                String id="", name="" ,author="",album="",genre="" ,url="" ;
                ResultSet rs;

              try {
                Class.forName("org.sqlite.JDBC");
                c = DriverManager.getConnection("jdbc:sqlite:music.db");
                c.setAutoCommit(false);
                System.out.println("Opened database successfully");
                stmt = c.createStatement();
                String sql = "UPDATE MUSIC set FAV = 0 where lower(name) LIKE '"+songname+"';";
                stmt.executeUpdate(sql);
                c.commit();
                System.out.println("song "+songname+" removed from favorites successfully");
              }catch(Exception e){
                e.printStackTrace();
               }
         }



        }

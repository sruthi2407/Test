package collectionsex;

import java.util.ArrayList;

public class PlayerMain {

	public static void main(String[] args) {
		//Creating Song Object ready with arraylist
		ArrayList<Song> s= new ArrayList<Song>();
		s.add(MP3CBR.getObject("Shreya", 2.3f, 120));
		s.add(MP3VBR.getObject("Neha Kakkar", 3.4f, 120, 320));
		s.add(MP3CBR.getObject("Badshah", 4.3f, 120));
		s.add(MP3VBR.getObject("Shreya", 2.3f, 96, 120));
		s.add(MP3VBR.getObject("Kailash Kher", 5.5f, 120, 320));
		s.add(MP3CBR.getObject("Sonu Nigam", 5.6f, 220));
		
		
		//Creating playlist of name MyPlaylist
		//Song.sortColumn="songName";
		Playlist list = Playlist.getObject("MyPlaylist", s);
		//Playlist list = Playlist.getObject();
		
		
		//Creating player object
		Player p = Player.getObject("MyPlayer", list);
		
		System.out.print("Player : " + p);
		p.playSongs();
		 
		 
	}

}

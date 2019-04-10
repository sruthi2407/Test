package collectionsex;

import java.util.ArrayList;

public class Playlist {
	private String playListName;
	private ArrayList<Song> sng;
	
	private Playlist() {
		this("NoList", null);
	}
	private Playlist(String pln, ArrayList<Song> sg) {
		sng = new ArrayList<Song>(); 
		playListName =pln;
		sng=sg;
	}
	
	public static Playlist getObject() {
		return new Playlist();
	}
	public static Playlist getObject(String pln, ArrayList<Song> sg) {
		return new Playlist(pln, sg);
	}
	public String getPlayListName() {
		return playListName;
	}
	public void setPlayListName(String playListName) {
		this.playListName = playListName;
	}
	public ArrayList<Song> getSng() {
		return sng;
	}
	public void setSng(ArrayList<Song> sng) {
		this.sng = sng;
	}
	
	@Override
	public String toString() {
		return playListName + sng.size();
	}

}

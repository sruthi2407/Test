
package collectionsex;

public abstract class Song implements Comparable {
	private String songName;
	private float songlen;
	public static String sortColumn;
	
	public Song() {
		this("NoSong", 0.0f);
	}
	public Song(String sn, float sl) {
		songName=sn;
		songlen=sl;
	}
	
	
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
	public float getSonglen() {
		return songlen;
	}
	public void setSonglen(float songlen) {
		this.songlen = songlen;
	}
	
	@Override
	public String toString() {
		String s;
		s=songName + " : " + songlen;
		return s;
	}
	@Override
	public int compareTo(Object o) {
		Song ro = (Song)o;
		if(sortColumn.equalsIgnoreCase("songName")) {
			return this.songName.compareTo(ro.songName);
		}
		else {
			return 0;
		}
	}
}

package collectionsex;

public class MP3CBR extends Song{
	private int bitRate;
	
	private MP3CBR() {
		super("NoSong", 0.0f);
	}
	private MP3CBR(String sn, float sl, int br) {
		super(sn, sl);
		bitRate=br;
	}
	
	public static MP3CBR getObject() {
		return new MP3CBR();
	}
	public static MP3CBR getObject(String sn, float sl, int br) {
		return new MP3CBR(sn, sl, br);
	}

	public int getBitRate() {
		return bitRate;
	}

	public void setBitRate(int bitRate) {
		this.bitRate = bitRate;
	}
	@Override
	public String toString() {
	
		return "MP3CBR" + " Song name is " + super.toString() + " "+ "with bitrate of"  + " " + bitRate; 
	}
	
	
}

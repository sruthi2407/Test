package collectionsex;

public class MP3VBR extends Song{
	private int minbr, maxbr;
	
	
	private MP3VBR() {
		super();
	}
	private MP3VBR(String sn, float sl, int mn, int mx) {
		super(sn,sl);
		minbr=mn;
		maxbr=mx;
	}
	public static MP3VBR getObject() {
		return new MP3VBR();
	}
	public static MP3VBR getObject(String sn, float sl, int mn, int mx) {
		return new MP3VBR(sn, sl, mn, mx);
	}

	public int getMinbr() {
		return minbr;
	}

	public void setMinbr(int minbr) {
		this.minbr = minbr;
	}

	public int getMaxbr() {
		return maxbr;
	}

	public void setMaxbr(int maxbr) {
		this.maxbr = maxbr;
	}
	@Override
	public String toString() {
		return "MP3VBR" + " " + "Song name is "+ super.toString() + " " + "with bitrate " + " " + minbr + " to " + maxbr ;
	}
}

package collectionsex;

public class Player {
	private String playerName;
	private Playlist playListName;
	
	private Player() {
		
	}
	private Player(String pn, Playlist pln) {
		playerName=pn;
		playListName=pln;
	}
	
	public static Player getObject() {
		return new Player();
	}
	public static Player getObject(String pn, Playlist pln) {
		return new Player(pn, pln);
	}
	
	public void playSongs() {
		for(Song s: playListName.getSng()) {
			System.out.print("\nSong is playing : " + s);
			try {
				Thread.sleep(450);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
				
			}
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public Playlist getPlayListName() {
		return playListName;
	}
	public void setPlayListName(Playlist playListName) {
		this.playListName = playListName;
	}
	
	@Override
	public String toString() {
		return playerName + " , " + playListName;
	}
}


public class Song {

	private String songName;
	private String singer;
	private double duration;
	private String albumName;
	private double price;

	public Song(String songName, String singer, double duration, String albumName, double price) {
		super();
		this.songName = songName;
		this.singer = singer;
		this.duration = duration;
		this.albumName = albumName;
		this.price = price;
	}

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	public String getAlbumName() {
		return albumName;
	}

	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public void printSongInfo() {
		System.out.println("şarkı adı: " + getSongName());
		System.out.println("sanatçı adı: " + getSinger());
		System.out.println("albüm adı: " + getAlbumName());
		//System.out.println("şarkı süresi: " + getDuration());
		System.out.println("şarkı ücreti: " + getPrice() + " tl");
	}
	
	

}

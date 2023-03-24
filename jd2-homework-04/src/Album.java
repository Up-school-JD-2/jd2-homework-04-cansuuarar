import java.util.ArrayList;
import java.util.List;

public class Album {
	private String albumName;
	private String singerName;
	private int publishDate;
	private double price;
	private List<Song> song = new ArrayList<>();

	public Album(String albumName, String singerName, int publishDate, List<Song> song, double price) {
		super();
		this.albumName = albumName;
		this.singerName = singerName;
		this.publishDate = publishDate;
		this.song = song;
		this.price = price;
	}
	
	public Album() {
		// TODO Auto-generated constructor stub
	}

	public String getAlbumName() {
		return albumName;
	}

	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}

	public String getSingerName() {
		return singerName;
	}

	public void setSingerName(String singerName) {
		this.singerName = singerName;
	}

	public int getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(int publishDate) {
		this.publishDate = publishDate;
	}

	public List<Song> getSong() {
		return song;
	}

	public void setSong(List<Song> song) {
		this.song = song;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void printAlbumInfo() {
		System.out.println("Album adı: " + getAlbumName());
		System.out.println("Sanatçı adı: " + getSingerName());
		System.out.println("Yayın tarihi: " + getPublishDate());

		System.out.print("Şarkı listesi: ");
		for (Song s : song) {
			System.out.print(s.getSongName() + ",");
		}
		System.out.println();
		System.out.println("Albüm fiyatı: " + getPrice() + " tl");

	}

}

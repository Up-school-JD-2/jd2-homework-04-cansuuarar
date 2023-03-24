import java.util.ArrayList;
import java.util.List;

public class Cart {

	private List<Album> album = new ArrayList<>();
	private List<Song> song = new ArrayList<>();
	private double totalPrice;
	
	public Cart(List<Album> album, List<Song> song, double totalPrice) {
		super();
		this.album = album;
		this.song = song;
		this.totalPrice = totalPrice;
	}

	public List<Album> getAlbum() {
		return album;
	}

	public void setAlbum(List<Album> album) {
		this.album = album;
	}

	public List<Song> getSong() {
		return song;
	}

	public void setSong(List<Song> song) {
		this.song = song;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}



}

import java.util.ArrayList;
import java.util.List;

public class PurchaseManager {

	private List<Cart> cart;
	private List<Album> album;
	private List<Song> song;

	public PurchaseManager() {
		album = new ArrayList<>();
		song = new ArrayList<>();
		cart = new ArrayList<>();

	}

	public PurchaseManager(List<Cart> cart, List<Album> album, List<Song> song) {
		this.cart = cart;
		this.album = album;
		this.song = song;
	}

	public void buyAlbum(Album album) {
		this.album.add(album);
		System.out.println(album.getAlbumName() + " albumü satın alındı.");
		System.out.println("Toplam albüm fiyatı: " + totalPriceAlbum());
		System.out.println();
	}

	public void buySong(Song song) {
		this.song.add(song);
		System.out.println(song.getSongName() + " şarkısı satın alındı.");
		System.out.println("Toplam şarkı fiyatı: " + totalPriceSong());
		System.out.println();
	}

	public double totalPriceSong() {
		double total = 0;
		for (int i = 0; i < song.size(); i++) {
			total += song.get(i).getPrice();
		}
		return total;
	}

	public double totalPriceAlbum() {
		double total = 0;
		for (int i = 0; i < album.size(); i++) {
			total += album.get(i).getPrice();
		}
		return total;
	}

	public void listAlbumPurchased() {
		System.out.println("*********Satın Alınan Albümler**********");
		for (Album album : this.album) { // this.album listesindeki değerleri tek tek album değişkenine atıyoruz
			album.printAlbumInfo();
			System.out.println();
		}
	}

	public void listSongPurchased() {
		System.out.println("*********Satın Alınan Şarkılar**********");
		for (Song songs : this.song) { // this.song listesindeki değerler tek tek songs değişkenine atıyoruz
			songs.printSongInfo();
			System.out.println();
		}
	}

	public void searchAlbum(Album album) {
		if (this.album.contains(album)) {
			System.out.println(album.getAlbumName() + " albümü bulundu.");
		} else
			System.out.println(album.getAlbumName() + " albümü bulunamadı.");
	}

	public void searchSong(Song song) {
		if (this.song.contains(song)) {
			System.out.println(song.getSongName() + " şarkısı bulundu.");
		} else {
			System.out.println(song.getSongName() + " şarkısı bulunamadı.");
		}

	}

}

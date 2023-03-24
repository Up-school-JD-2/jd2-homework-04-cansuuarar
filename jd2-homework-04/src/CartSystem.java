import java.util.ArrayList;
import java.util.List;

public class CartSystem {
	
	private List<Cart> cart;
	private List<Album> album;
	private List<Song> song;

	public CartSystem() {
		album = new ArrayList<>();
		song = new ArrayList<>();
		cart = new ArrayList<>();
	}
	
	public void addAlbumtoCart(Album album) {
		this.album.add(album);
		System.out.println(album.getAlbumName() + " albümü sepete eklendi.");
		System.out.println();
	}
	
	public void addSongtoCart(Song song) {
		this.song.add(song);
		System.out.println(song.getSongName() + " şarkısı sepete eklendi.");
		System.out.println();
	}
	
	
	public void listAlbuminCart() {
		System.out.println("*********Sepetteki Albümler**********");
		for (Album album : this.album) { //this.album listesindeki değerleri tek tek album değişkenine atıyoruz
			album.printAlbumInfo();
			System.out.println();
		}
	}
	
	public void listSonginCart() {
		System.out.println("*********Sepetteki Şarkılar**********");
		for (Song songs : this.song) { //this.song listesindeki değerler tek tek songs değişkenine atıyoruz
			songs.printSongInfo();
			System.out.println();
		}
	}

}

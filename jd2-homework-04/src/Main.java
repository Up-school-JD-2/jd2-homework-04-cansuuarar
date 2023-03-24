import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		
		UserSystem userSystem = new UserSystem();
		PurchaseManager purchaseManager = new PurchaseManager();
		CartSystem cartSystem = new CartSystem();

		User user1 = new User("Cansu", "cansu@com", "1234");
		User user2 = new User("Cem", "cem@com", "1234");

		Song song1 = new Song("Günesi Beklerken", "Mor ve Ötesi", 3, "Yaz", 2);
		Song song3 = new Song("Bazen", "Mor ve Ötesi", 4, "Yaz", 3);
		
		Song song2 = new Song("Rüya", "Mor ve Ötesi", 3, "Şehir", 10);
		

		Album album1 = new Album("Yaz", "Mor ve Ötesi", 2003, Arrays.asList(song1,song3), 10);
		Album album2 = new Album("Şehir", "Mor ve Ötesi", 1996, Arrays.asList(song2), 20);

		

		userSystem.createAccount(user1);
		userSystem.createAccount(user2);

		cartSystem.addAlbumtoCart(album1);
		cartSystem.addAlbumtoCart(album2);
				
		cartSystem.addSongtoCart(song1);
		cartSystem.addSongtoCart(song2);
		cartSystem.addSongtoCart(song3);

		purchaseManager.buyAlbum(album1);
		purchaseManager.buyAlbum(album2);

		purchaseManager.buySong(song1);
		purchaseManager.buySong(song2);

		purchaseManager.totalPriceAlbum();
		purchaseManager.totalPriceSong();

		userSystem.listUsers();

		purchaseManager.listAlbumPurchased();
		cartSystem.listAlbuminCart();
		
		
		purchaseManager.listSongPurchased();
		cartSystem.listSonginCart();
		
		
		
		//purchaseManager.searchAlbum(album2);
	}

}

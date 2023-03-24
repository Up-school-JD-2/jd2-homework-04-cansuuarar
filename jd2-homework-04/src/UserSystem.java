import java.util.ArrayList;
import java.util.List;

public class UserSystem {

	private List<User> user = new ArrayList<>();

	public UserSystem() {
	}

	public UserSystem(List<User> user) {
		super();
		this.user = user;
	}

	public List<User> getUser() {
		return user;
	}

	public void setUser(List<User> user) {
		this.user = user;
	}

	public void createAccount(User user) {
		this.user.add(user);
		System.out.println(user.getUserName() + " kullanıcısı olusturuldu.");
		System.out.println();
	}
	
	public void listUsers() {
		System.out.println("*********Kullanıcılar**********");
		for(User users: this.user) {
			users.printUserInfo();
			System.out.println();
		}
	}
	

}

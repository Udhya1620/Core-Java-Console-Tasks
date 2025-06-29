package loginForm;

public class Main {

	public static void main(String[] args) {
		
		LoginManager loginmanager = new LoginManager();
		
		loginmanager.login(2787244249l, "1234567890");
		loginmanager.login("demo@gmail.com", "1234567890");
		
	}
}

package loginForm;

public class LoginManager {
	
	private String email = "demo@gmail.com";
	
	private String password = "1234567890";
	
	private long mobileNumber = 278724424l;

	public void login(String email, String password) {
		if(email.equals(this.email) && password.equals(this.password)) {
			System.out.println("The entered credentials are correct ");
		}
		else {
			System.out.println("The entered credentials are incorrect please try again");
		}
		
	}
	public void login(long mobileNumber, String password) {
		if(mobileNumber == this.mobileNumber && password.equals(this.password)) {
			System.out.println("The entered credentials are correct ");
		}
		else {
			System.out.println("The entered credentials are incorrect please try again");
		}
		
	}
}

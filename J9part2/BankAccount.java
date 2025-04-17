package J9part2;

public class BankAccount {

	 public int accountNumber ;
	 public String accountHolderName;
	 public int balance;
	 
	
    public BankAccount(int accountNumber, String accountHolderName, int balance){
    	this.balance = balance;
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
	}
	
	public void accountDetails(){
		System.out.println("Account Number        : "+accountNumber);
		System.out.println("Account Holder Name   : "+accountHolderName);
		System.out.println("Account Balance       : "+balance);
	}
	
	public void balance() {
		System.out.println("Account Balance       : "+balance);
	}
}

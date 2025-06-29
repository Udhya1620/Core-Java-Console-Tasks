package bankingApp;

public class SavingsAccount extends BankAccount {
	public int interestRate;
	
	public SavingsAccount(int accountNumber, String accountHolderName,int balance, int interestrate) {
		super(accountNumber, accountHolderName, balance);
		this.interestRate = interestrate;
	}
	
	public void depositing(int dep) {
		super.balance = super.balance + dep;
		System.out.println("Rs "+dep+" deposit is done. "+"balance amount : "+balance);
	}
	
	public void withdraw(int withdraw) {
		if(withdraw > balance) {
			System.out.println("Lower the amount");
		}
		else {
		super.balance = super.balance - withdraw;
		System.out.println("Rs "+withdraw+" withdrawal is done. "+"Account Balance : "+balance);
		}
	}

	public void accountDetails() {
		super.accountDetails();
		System.out.println("Account Interest Rate : "+interestRate+"%");
	}

}

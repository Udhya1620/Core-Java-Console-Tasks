package J9part2;

public class FixedDepositAccount extends BankAccount{
	
	public int maturityPeriod;
	
	public FixedDepositAccount(int accountNumber, String accountHolderName, int balance, int maturityPeriod) {
		super(accountNumber, accountHolderName, balance);
		this.maturityPeriod = maturityPeriod;
	}
	
	public void accountDetials() {
		super.accountDetails();
		System.out.println("Maturity period       : "+maturityPeriod+" years");
	}
	
	public void deposit(int dep) {
		System.out.println( "deposit cannot be done in fixed deposit account"); 
	}
	
	public void withdraw(int withdraw) {
		System.out.println( "withdraw cannot be done in fixed deposit account"); 
	}
	
}

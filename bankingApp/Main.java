package bankingApp;

public class Main {

	public static void main(String[] args) {

		SavingsAccount savingsaccount = new SavingsAccount(7947927, "accUser", 20000, 12);
		savingsaccount.accountDetails();
		savingsaccount.withdraw(100);
		savingsaccount.depositing(1000);
		System.out.println();
		
		FixedDepositAccount fd = new FixedDepositAccount(4792874, "fdUser", 10000, 3);
		fd.accountDetials();
		fd.deposit(500);
		fd.withdraw(100);
		fd.balance();
	}

}
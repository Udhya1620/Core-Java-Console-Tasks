package customExceptions;

  public class BankAccount {
	  
     public static double bankBalance = 1000;
	
     public void withdraw(double amount) throws InsufficientFundsException {
    
		if(amount>bankBalance) {
    		throw new InsufficientFundsException("Enter minimum amount campared to your balance");
    	}
		else {
			bankBalance = bankBalance-amount;
			System.out.println("Transaction is done ");
		}
     }

}

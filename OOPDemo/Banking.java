package OOPDemo;

public class Banking {

	
//	3. Create a class named Banking. It should contain methods for withdrawal
//	and deposit. Account balance should be initialized in a constructor.
	
	public int accountBalance;
	
	Banking(int accountbalance){
		this.accountBalance = accountbalance;
	}
	
	public String withDraw(int withDrawAmount) {

		if (withDrawAmount > accountBalance) {
			return  "Lower the amount of withdrawal because the account balance is : " + accountBalance;
		} else {
			return "Withdraw successfull. The remaining amount is : "
					+ (accountBalance = accountBalance - withDrawAmount);
		}
		
	}
	
	public String deposit(int depositAmount) {

		accountBalance = accountBalance+depositAmount;
		
		return "Amount deposited : "+depositAmount+" Balance : "+accountBalance;
		
	}
}

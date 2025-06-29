package encapsulaton;

//3. Create a class named Banking. It should contain methods for withdraw
//and deposit. Account balance should be defined as public variable and
//used in both methods.

public class Banking {

	public int accountBalance = 2000;

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

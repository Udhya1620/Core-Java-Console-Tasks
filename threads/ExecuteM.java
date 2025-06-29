package threads;

public class ExecuteM {

	public static void main(String[] args) {
 
		Thread table1 = new Thread(new MtTab(5));
		Thread table2 = new Thread(new MtTab(5));
		
		table1.start();
		table2.start();
	}
}

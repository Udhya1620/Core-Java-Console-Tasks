package threads;

public class ForResThread {

	public static void main(String[] args) {
		
	Thread forward = new Thread(new ForNum());
	Thread reverse = new Thread(new ResNum());

	forward.start();
	
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	
	reverse.start();
	}

}

package j19_part2;

public class ForNum implements Runnable {

	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		 try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
}

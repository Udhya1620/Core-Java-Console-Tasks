package j19_part2;

public class ResNum implements Runnable {

	public void run() {
		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
		 try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

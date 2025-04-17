package j19_part2;

public class MtTab implements Runnable {

	private int n;

	public MtTab(int n) {
		this.n = n;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " * " + i + " " + " = " + i * n);
		}

	}

}

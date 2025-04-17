package J11part2;

public class Iphone15 extends Iphone {

	void getDetails(double display, String chip, String camerasys) {
		this.display = display;
		this.chipset = chip;
		this.cameraSystem = camerasys;

	}

	void displayFeatures() {
		System.out.println("Iphone 15 features : ");
		System.out.println(this.display + "-inch display");
		System.out.println(this.chipset + " Bionic chipset");
		System.out.println(this.cameraSystem + "-camera system");
	}
}

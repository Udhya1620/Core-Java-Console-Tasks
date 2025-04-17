package practicecodes;

abstract class Vehicle {
	void startEngine() {
		System.out.print("Engine started");
	}
	static String getVehicleType(String name) {
		return name;
	}
	void drive(){
		System.out.print("How the Vehicle is driven ");
	}
}
class Car extends Vehicle{
   void	drive(){
	   System.out.print("Driven by 4 wheels");	
	}
}

class Motorcycle extends Vehicle{
	 void drive(){
		   System.out.print("Driven by 2 wheels");	
		}
}

public class hierarchy {
   
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.drive();
	}
}

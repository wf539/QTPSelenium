
public class Car {

	String model;
	int price;
	static int wheels = 4;
	
	// constructor; overloading
	
	public Car(String model, int price) {
		
		this.model = model;
		this.price = price;
	} 
	
	public Car() {
		
		System.out.println("No args in Car consrtuctor");
		
	}
	
	public static void main(String[] args) {
		// create an object of the class
		
		Car c1 = new Car();
		c1.model = "Renault";
		c1.price = 300;
		c1.start();
		c1.accel();
		
		Car c2 = new Car();
		c2.model = "Mercedes-Benz";
		c2.price = 20000;
		c2.start();
		c2.accel();
		
		System.out.println(c1.model);
		System.out.println(c2.model);
		
		// static
		
		System.out.println(wheels);
		System.out.println(Car.wheels);
		System.out.println(c2.wheels);
		c1.wheels = 8;
		System.out.println(wheels);
		System.out.println(Car.wheels);
		System.out.println(c2.wheels);
		
		fillGas(100);
		Car.fillGas(200);
		c1.fillGas(900);

	}
	
	public void start() {
		
		System.out.println("Call function start(): " + model + " starting.");
		
	}
	
	public void accel() {
		
		System.out.println("Call function accel(): " + model + " accelerating.");
		
	}
	
	public static void fillGas(int quantity) {
		
		
	}

}

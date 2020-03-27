
public class ConstructorExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Car a = new Car();
		Car b = new Car();
		Car c = new Car();
		
		a.model = "Honda";
		a.price = 4500;
		
		Car d = new Car("Alfa Romeo", 300);
		System.out.println(d.model);
		System.out.println(d.price);

		Car e = new Car("Maserati", 300000);
		System.out.println(e.model);
		System.out.println(e.price);
	}

}

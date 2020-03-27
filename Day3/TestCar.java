
public class TestCar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car a = new Car();
		Car b = new Car();
		Car c = new Car();
		
		a.model = "A";
		b.model = "B";
		c.model = "C";
		
		System.out.println(a.model);
		System.out.println(b.model);
		System.out.println(c.model);
		
		a = b;
		b = c;
		c = a;
		
		System.out.println(a.model);
		System.out.println(b.model);
		System.out.println(c.model);
		
		a.model = "uiotwerjkjklvfsdiojkl";
		
		System.out.println(a.model);
		System.out.println(b.model);
		System.out.println(c.model);

	}

}

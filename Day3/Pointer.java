
public class Pointer {

	int x;
	int y;
	
	public static void main(String[] args) {
	
		Pointer p = new Pointer();
		p.x = 10;
		p.y = 20;
		
		System.out.println("x co-ordinate: " + p.x + " y co-ordinate: " + p.y);
		
		swap(p.x, p.y);
		System.out.println("Applying function swap()...");
		
		System.out.println("x co-ordinate: " + p.x + " y co-ordinate: " + p.y);
		
		swapVals(p);
		System.out.println("Applying function swapVals()...");
		
		System.out.println("x co-ordinate: " + p.x + " y co-ordinate: " + p.y);
		
		
	}
	
	public static void swap(int a, int b) { // pass by value
		
		int temp = a;
		a = b;
		b = temp;
		
	}
	
	public static void swapVals(Pointer t) { // pass by reference
		
		int temp = t.x;
		t.x = t.y;
		t.y = temp;
		
		
	}

}


public class StaticNonStatic {
	
	// global variables - used across all functions, with conditions
	
	String name;	// non-static global variable
	static int age; // static global variable

	/**
	 * @param args
	 */
	public static void main(String[] args) { 	// static function cannot access non-static variables
												// nor call non-static functions
		
		sum();
		// sendMail();
		
		age = 40;
		// name = "me";

	}
	
	public static void sum() {
		int i = 100; //local variable
		
	}
	
	public void sendMail() { // non-static function
		int y = -300;
		
		sum();
		sendMail();
		
		age = 40;
		name = "me";
		
	}

}

package lesson4;

public class Test {
	
	public static void main(String[] args) {
		
		String test = "Hello World!";
		
		System.out.println(test.toLowerCase());
		System.out.println(test.toUpperCase());
		
		/*
		 * String test2 = test.replace('l', 'G'); System.out.println(test2);
		 * System.out.println(test.indexOf(' '));
		 * System.out.println(test.equals(test2));
		 */
		String test3 = "Hello World!";
		/*
		 * System.out.println(test.equals(test3)); System.out.println(test.length());
		 */
		equality(test, test3);
	}
	
	public static void equality(String t1, String t2) {
		
		if	(t1.equals(t2)) {
			System.out.println("TRUE");
		} else {
			System.out.println("FALSE");
		}
		System.out.println("Method !");
	}

}

package lesson4;

public class Test3 {
	
	public static void main(String[] args) {
		
		String t1 = "Hello";
		String t2 = "World!";
		
		System.out.println(com(t1, t2));
		
	}
	
	public static String com(String line1, String line2) {
		
		String symbol = "w";
		
		if	(line1.contains(symbol) && line2.contains(symbol)) {
			return line1 + " " + line2;
		} else {
			return "Sorry!";
		}
	}

}

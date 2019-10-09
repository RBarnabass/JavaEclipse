package lesson5;

public class ApplicationLoops {
	public static void main(String[] args) {

		int a = 1;
		while (a < 10) {
//			System.out.println(a);
			a++;
		}
		System.out.println();

		int b = 1;
		do {
//			System.out.println(b);
			b++;
		} while (b < 10);

		System.out.println();

		// 1000 1003 1006 ...

		int sum = 1000;
		while (sum < 10000) {
//			System.out.println(sum);
			sum += 3;
		}

		
		
		//2 4 8 16 32 64 128 ...
		
		int summary = 2;
		int count =0;
		
		while(count<20) {
			System.out.println(summary);
			summary*=2;
			count++;
		}
		
		
	}
}

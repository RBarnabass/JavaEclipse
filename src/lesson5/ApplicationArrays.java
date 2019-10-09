package lesson5;

public class ApplicationArrays {

	public static void main(String[] args) {

		int[] array = new int[10];
		array[0] = 10;
		array[1] = 11;
		array[2] = 12;
		array[3] = 13;
		array[4] = 14;
		array[5] = 15;
		array[6] = 16;
		array[7] = 17;
		array[8] = 18;
		array[9] = 19;

		showArray(array);

		for (int i = 0; i < array.length; i++) {
			array[i] = i * i;
		}
		showArray(array);

		int[] array2 = { 33, 5, 7, 99, 23, 754, 2, 11, 3456, 23 };

		boolean isSorted = false;

		int data = 0;
		while (!isSorted) {
			isSorted = true;
			for (int i = 0; i < array2.length - 1; i++) {

				if(array2[i] > array2[i+1]) {
					isSorted = false;
					data = array2[i];
					array2[i] = array2[i+1];
					array2[i+1] = data;
				}
				
			}
		}

		showArray(array2);
		
		
	}

	static void showArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println();
	}

}

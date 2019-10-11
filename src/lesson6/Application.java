package lesson6;

import java.util.Random;

public class Application {
	
    public static void main(String[] args) {

        int[] array = getRandomArray(20);
        printArrayInLine(array);
        sortByBubble(array);
        printArrayInLine(array);
        int position = searchElementPosition(array, 8);

        System.out.println();
        System.out.println("Position: " + position);
    }

    private static int[] getRandomArray(int size) {

        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
        }

        return array;
    }

    private static void printArrayInLine(int[] array) {
        System.out.println();

        for (int index : array) {
            System.out.print(index + " ");
        }
        System.out.println();
    }

    private static void sortByBubble(int[] array) {

        int arrayLength = array.length;
        int currentElement;
        int nextElement;

        for (int i = 0; i < arrayLength; i++) {

            for (int j = 0; j < arrayLength - i - 1; j++) {

                currentElement = array[j];
                nextElement = array[j + 1];

                if (currentElement < nextElement) {
                    swap(array, j, j + 1);
                }
            }
        }
    }

    private static void swap(int[] array, int current, int next) {
        int temporaryBox = array[current];
        array[current] = array[next];
        array[next] = temporaryBox;
    }

    private static int searchElementPosition(int[] array, int value) {

        int length = array.length;
        int topPosition = length - 1;
        int bottomPosition = 0;

        while (bottomPosition <= topPosition) {

            int middlePosition = (topPosition + bottomPosition) >>> 1;
            int middleElement = array[middlePosition];

            if (middleElement > value) {
                topPosition = middlePosition - 1;
            } else if (middleElement < value) {
                bottomPosition = middlePosition + 1;
            } else {
                return middlePosition;
            }
        }

        return -(bottomPosition + 1);
    }

}

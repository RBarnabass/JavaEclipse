package lesson5;

public class Addition {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            System.out.println(i);
        }


        int[][] array = new int[2][2];

        array[0][0] = 1;
        array[0][1] = 2;
        array[1][0] = 3;
        array[1][1] = 4;

        for (int i = 0; i < array.length; i++) {

            System.out.println();
            for (int j = 0; j < array.length; j++) {

                System.out.println(array[i][j]);
            }
        }

    }

}

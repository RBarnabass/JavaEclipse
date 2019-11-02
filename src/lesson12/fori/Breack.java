package lesson12.fori;

public class Breack {
    public static void main(String[] args) {

        aaa: for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 3) {
                    break aaa;
                }
                System.out.print(i + " ");
                System.out.println(j);
            }
        }
    }
}

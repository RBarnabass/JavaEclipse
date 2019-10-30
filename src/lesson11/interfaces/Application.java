package lesson11.interfaces;

public class Application {
    public static void main(String[] args) {
        Ferrari f360 = new Ferrari(
                "F360",
                280,
                1_000_000,
                "Sparco");

        System.out.println(f360);
        f360.addSpeed();
        System.out.println(f360);

        System.out.println();
        f360.horn();
        Speedable.horn2();
    }
}

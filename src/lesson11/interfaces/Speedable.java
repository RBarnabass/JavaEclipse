package lesson11.interfaces;

public interface Speedable {
    void addSpeed();

    default void horn() {
        System.out.println("Horn");
    }

    static void horn2() {
        System.out.println("Horn 2");
    }
}

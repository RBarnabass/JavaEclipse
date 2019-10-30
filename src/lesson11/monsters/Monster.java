package lesson11.monsters;

public interface Monster {
    void eat();

    default void testKillAll() {
        System.out.println("Default kill all methods");
    }
}

package lesson10.abstraction;

public class Human extends Creature {

    public static final int SERIAL_NUMBER = 123;

    @Override
    void move() {
        System.out.println("Human move");
    }

    @Override
    void eat() {
        System.out.println("Human eat");
    }

    @Override
    public int getHeight() {
        return 10;
    }

/*    @Override
    public double getWeight() {
        return 0.2;
    }*/
}

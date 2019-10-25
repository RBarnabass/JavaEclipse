package lesson10.abstraction;

public abstract class Creature {

    private double weight;
    private int height;

    static  {
        System.out.println("Static block");
    }

    public Creature() {
        System.out.println("Constructor");
    }

    public Creature(double weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    abstract void move();
    abstract void eat();

    public final double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}





















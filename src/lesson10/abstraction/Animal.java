package lesson10.abstraction;

import java.util.Objects;

public class Animal extends Creature {

    private String breed;
    private int maxSpeed;

    public Animal() { }

    public Animal(String breed, int maxSpeed) {
        super(0.1, 1);
        this.breed = breed;
        this.maxSpeed = maxSpeed;
    }

    @Override
    void move() {
        System.out.println("Animal move");
    }

    @Override
    void eat() {
        System.out.println("Animal eat");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "breed='" + breed + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return maxSpeed == animal.maxSpeed &&
                Objects.equals(breed, animal.breed);
    }
}



















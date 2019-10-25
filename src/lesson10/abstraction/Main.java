package lesson10.abstraction;

public class Main {

    public static void main(String[] args) {

        System.out.println("Start program !");
        //Creature creature = new Creature();
        Creature animal = new Animal("RRR", 10);
        //System.out.println(animal.getHeight());
        //System.out.println(animal.getWeight());
        System.out.println(animal.hashCode());
        System.out.println(animal.getClass());
        System.out.println(animal);

        final Creature human = new Human();

        int serialNumber = Human.SERIAL_NUMBER;
        System.out.println(serialNumber);

        System.out.println(animal.equals(human));
        //System.out.println(human.getHeight());
        //System.out.println(human.getWeight());

        //doWork(animal);
        //doWork(human);


    }

    private static void doWork(Creature creature) {
        creature.eat();
        creature.move();
    }
}











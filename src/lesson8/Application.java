package lesson8;

public class Application {

    public static void main(String[] args) {

        Animal makaka = new Animal();
        makaka.setName("Roman");


        method(new Animal());
        System.out.println(makaka);
    }

    public static void method(Animal animal) {
        System.out.println(animal);
        animal.setName("RRrrr");
    }
}

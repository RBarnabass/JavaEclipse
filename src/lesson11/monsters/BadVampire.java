package lesson11.monsters;

public class BadVampire implements Vampire {


    @Override
    public void destroy() {
        System.out.println("Vampire will destroy.");
    }

    @Override
    public void eat() {
        System.out.println("Vampire will eat.");
    }

    @Override
    public void kill() {
        System.out.println("Vampire will kill.");
    }
}

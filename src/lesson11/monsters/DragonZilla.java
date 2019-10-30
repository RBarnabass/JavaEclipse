package lesson11.monsters;

public class DragonZilla implements DangerousMonster {

    @Override
    public void destroy() {
        System.out.println("I'm DragonZilla - I will destroy.");
    }

    @Override
    public void eat() {
        System.out.println("I'm DragonZilla - I will eat.");
    }
}

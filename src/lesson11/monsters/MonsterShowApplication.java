package lesson11.monsters;

public class MonsterShowApplication {
    public static void main(String[] args) {
        DangerousMonster dangerousMonster = new DragonZilla();
        dangerousMonster.testKillAll();
        dangerousMonster.eat();
        dangerousMonster.destroy();

        System.out.println();

        Vampire vampire = new BadVampire();

        eat(vampire);
        eat(dangerousMonster);
        System.out.println();
        kill(vampire);
    }

    private static void eat(Monster monster) {
        monster.eat();
    }

    private static void kill(Lethal lethal) {
        lethal.kill();
    }
}

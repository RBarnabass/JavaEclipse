package lesson11.delegation;

public class SpaceShipControl {

    public void up(int km) {
        System.out.println("Space ship is moving UP on: " + km + " km.");
    }

    public void down(int km) {
        System.out.println("Space ship is moving DOWN on: " + km + " km.");
    }

    public void left(int km) {
        System.out.println("Space ship is moving LEFT on: " + km + " km.");
    }

    public void right(int km) {
        System.out.println("Space ship is moving RIGHT on: " + km + " km.");
    }
}

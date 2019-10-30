package lesson11.delegation;

public class Application {
    public static void main(String[] args) {

        SpaceShip spaceShip = new SpaceShip();
        spaceShip.moveUp(10);
        spaceShip.moveDown(5);
        spaceShip.moveLeft(7);
        spaceShip.moveRight(11);
    }
}

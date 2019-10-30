package lesson11.delegation;

public class SpaceShip {

    private String shipName;
    private SpaceShipControl spaceShipControl = new SpaceShipControl();

    public void moveUp(int km) {
        spaceShipControl.up(km);
    }

    public void moveDown(int km) {
        spaceShipControl.down(km);
    }

    public void moveRight(int km) {
        spaceShipControl.right(km);
    }

    public void moveLeft(int km) {
        spaceShipControl.left(km);
    }
}

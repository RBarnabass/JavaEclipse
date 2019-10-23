package lesson9;

public class Application {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();

        vehicle.drive();
        vehicle.faster();
        vehicle.stop();
        vehicle.getNumber();

        Car car = new Car();

        car.drive();
        car.faster();
        car.stop();
        car.superMethod();
        car.getNumber();
        car.getInterest();

        Bicycle bicycle = new Bicycle();
        bicycle.drive();

    }
}

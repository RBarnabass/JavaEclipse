package lesson9;

public class Application2 {

    public static void main(String[] args) {

        Bus bus = new Bus(new Motor());

        Motor motor = bus.getMotor();
        System.out.println(motor.getPower());
        motor.setPower(1000);

        System.out.println(bus.getMotor().getPower());
        System.out.println(motor.getPower());

    }
}

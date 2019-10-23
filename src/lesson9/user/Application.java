package lesson9.user;

public class Application {

    public static void main(String[] args) {

        Name name = new Name();
        name.setFirstName("Roman");
        name.setLastName("Berezhnov");

        Address address = new Address();
        address.setCountry("Ukraine");
        address.setCity("Lviv");
        address.setStreet("Ivana Franka");
        address.setZipCode(79023);

        User user = new User(name, address);
        user.setAge(30);
    }
}

package lesson9.user;

public class User {

    private Name name;
    private Address address;
    private int age;

    public User() {
    }

    public User(Name name, Address address) {
        this.name = name;
        this.address = address;
    }

    public User(Name name, Address address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

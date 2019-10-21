package lesson8;

public class Animal {

    private String type;
    private String name;
    private int age;
    private String color;

    public Animal() {
        this.type = "Monkey";
    }

    public Animal(String name) {

        this.name = name;
    }

    public Animal(String name, String type, String color) {
        this.name = name;
        this.type = type;
        this.color = color;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }

    public String getType() {
        return type;
    }

    public String toString() {
        return "name: " + name + "\n" +
                "type: " + type + "\n" +
                "color: " + color;
    }
}

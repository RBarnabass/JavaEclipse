package lesson12.phigura;

import lesson12.Person;

import java.util.LinkedHashMap;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Romb romb = new Romb();
        Other other = new Other();

        perimeter(triangle);
        perimeter(circle);
        perimeter(rectangle);
        //perimeter(romb);
        //perimeter(other);

        squre(triangle);
        squre(circle);
        //squre(rectangle);
        squre(romb);
        //squre(other);

        shape(triangle);
        shape(circle);
        //shape(rectangle);
        //shape(romb);
        //shape(other);
    }

    private static void perimeter(Perimeter perimeterimeter) {
        perimeterimeter.perimeter();
    }

    private static void squre(Squre squre) {
        squre.sqaure();
    }

    private static void shape(Shape shape) {
        shape.perimeter();
        shape.sqaure();
    }
}





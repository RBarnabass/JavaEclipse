package lesson12.interfaceUsage;

public class Main {

    public static void main(String[] args) {
        ImplementatorOne one = new ImplementatorOne();
        ImplementatorTwo two = new ImplementatorTwo();

        method(one);
        method(two);
    }

    private static void method(SuperInterface superInterface) {
        superInterface.print();
    }
}







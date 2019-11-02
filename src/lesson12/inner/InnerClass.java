package lesson12.inner;

public class InnerClass {

    public static final String PROGRAMING_LANGUAGE = "JAVA";
    private One one = new One();

    public void print() {
        System.out.println(one.number);
    }

    private static class One {
        public int number;
    }
}

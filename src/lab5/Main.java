package lab5;

public class Main {
    public static void main(String[] args) {
        Example1 testExample1 = new Example1();
        testExample1.setCh('V');
        System.out.println("Код символа: " + testExample1.getCh());
        testExample1.setPrint();

        Example2 testExample2 = new Example2();
        testExample2.setChar('k', 'f');
        testExample2.setPrint();
    }
}

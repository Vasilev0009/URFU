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
        System.out.print("\n");
        Example3 testExample3 = new Example3();
        Example3 test2Example3 = new Example3(23);
        Example3 test3Example3 = new Example3(23, 45);

        Example4 testExample4 = new Example4(25, 'F' );
        Example4 test2Example4 = new Example4(65.1267);

        Example5 testExample5 = new Example5();
        testExample5.setNumber();
        testExample5.print();
        testExample5.setNumber(25);
        testExample5.print();
        testExample5.setNumber(190);
        testExample5.print();
        Example5 test2Example5 = new Example5(140);
        test2Example5.print();
        Example5 test3Example5 = new Example5(-33);
        test3Example5.print();

        Example6 testExample6 = new Example6(22, 45);
        System.out.println("Значение min = " + testExample6.getMin() + ", значение max = " + testExample6.getMax() );
        Example6 test2Example6 = new Example6(17);
        System.out.println("Значение min = " + test2Example6.getMin() + ", значение max = " + test2Example6.getMax() );
        test2Example6.SetInt(-99);
        System.out.println("Значение min = " + test2Example6.getMin() + ", значение max = " + test2Example6.getMax() );
        test2Example6.SetInt(145, -10);
        System.out.println("Значение min = " + test2Example6.getMin() + ", значение max = " + test2Example6.getMax() );
    }
}

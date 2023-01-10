package lab6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №1:");
        Example1 testExample1 = new Example1();
        testExample1.setEx1('V');
        testExample1.setEx1("Тест строки");
        char[] char1 = {'Q'};
        testExample1.setEx1(char1);
        char[] char2 = {'A', 'R', 'R', 'A', 'Y'};
        testExample1.setEx1(char2);

        System.out.println("Задание №2:");
        Example2.getConst();
        Example2.getConst();
        Example2.getConst();

        System.out.println("Задание №3:");
        Example3 testExample3 = new Example3();
        int[] testInt = {1, 12, 7, 3, 35, 90, 22, 222, 8};
        testExample3.getMax(testInt);
        testExample3.getMin(testInt);
        testExample3.getMed(testInt);

        System.out.println("Задание №4:");
        Example4 testExample4 = new Example4();
        testExample4.getFactor(6);

        System.out.println("Задание №5:");
        Example5 testExample5 = new Example5();
        testExample5.getSum2(6);

        System.out.println("Задание №6:");
        Example6 testExample6 = new Example6();
        int[] inArray = {5, 8, -12, 32, 10, -88};
            System.out.println("Новый массив : " + Arrays.toString(testExample6.getArray(inArray, 4)));
        System.out.println("Задание №7:");

        Example7 testExample7 = new Example7();
        char[] charArray = new char[]{'е', 'к', 'л', 'м', 'н'};
            System.out.println(Arrays.toString(testExample7.convertCharArray(charArray)));
        System.out.println("Задание №8:");

        int[] intArray = {8, -4, 88, 27, -63, 77};
        System.out.println("Среднее значение = " + Example8.GetArrayMed(intArray));
        System.out.println("Задание №9:");

        Example9 testExample9 = new Example9();
        char[] chArray = {'т', 'о', 'р', 'о', 'б', 'о', 'а', 'н'};
            System.out.print(Arrays.toString(testExample9.ReversArray(chArray)) + "\n");

        System.out.println("Задание №10:");
        System.out.println("Максимум и минимум: " + Arrays.toString(Example10.calcMaxMin(2, -2, 5, 22, -56, 8)));
    }
}
package Lab1;

import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое слагаемое");
        float a = in.nextFloat();
        System.out.println("Введите второе слагаемое");
        float b = in.nextFloat();
        float sum = a + b;
        System.out.println("Сумма равна: " + sum);
    }
}

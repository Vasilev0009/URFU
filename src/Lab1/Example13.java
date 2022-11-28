package Lab1;

import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое слагаемое");
        int a = in.nextInt();
        System.out.println("Введите второе слагаемое");
        int b = in.nextInt();
        int sum = a + b;
        System.out.println("Сумма равна: " + sum);
        in.close();
    }
}

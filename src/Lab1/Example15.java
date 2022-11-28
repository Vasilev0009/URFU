package Lab1;

import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 2 числа:");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = a - b;
        int d = a + b;
        System.out.println("Суимма равна: " + d );
        System.out.println("Разность равна: " + c);
        in.close();
    }
}

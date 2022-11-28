package Lab2;

import java.util.Scanner;

// Напишите программу, которая проверяет, сколько тысяч во введенном
//пользователем числе (определяется четвертая цифра справа в десятичном
//представлении числа).
public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        int n = in.nextInt();
        n /= 1000;
            System.out.println("В данном числе :" +n +" тысяч");
            in.close();
    }
}

package Lab2;

import java.sql.SQLOutput;
import java.util.Scanner;

// Напишите программу, которая проверяет, делится ли
// введенное Пользователем число на 3.
public class Example1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        int n = in.nextInt();
        n %= 3;
        if (n == 0){
            System.out.println("Число делится на 3 без остатка");
        }else {
            System.out.println("Число не делится на 3 без остатка");
            in.close();
        }
    }
}

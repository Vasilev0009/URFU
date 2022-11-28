package Lab2;

import java.util.Scanner;

// Напишите программу, которая проверяет, попадает ли введение
//пользователем число в диапазон от 5 до 10 включительно.
public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        int n = in.nextInt();
        if (5 <= n & n <= 10){
            System.out.println("Число удовлетворяет критериям");
        }else {
            System.out.println("Число не удовлетворяет критериям");
            in.close();
        }
    }
}

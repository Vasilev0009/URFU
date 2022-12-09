package lab2;

import java.util.Scanner;

// Напишите программу, которая проверяет, удовлетворяет ли введенное
//пользователем число следующим критериям: число делится на 4, и при
//этом оно не меньше 10.
public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        int n = in.nextInt();
        int four = n % 4;
        if (four == 0 & n > 10){
            System.out.println("Число удовлетворяет критериям");
        }else {
            System.out.println("Число не удовлетворяет критериям");
            in.close();
        }
    }
}

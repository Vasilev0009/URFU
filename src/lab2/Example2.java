package lab2;

import java.util.Scanner;

// Напишите программу, которая проверяет, удовлетворяет ли введенное
//пользователем число следующим критериям: при делении на 5 в остатке
//получается 2, а при делении на 7 в остатке получается 1.
public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        int n = in.nextInt();
        int five = n % 5;
        int seven = n % 7;
        if (five == 2 & seven == 1){
            System.out.println("Число удовлетворяет критериям");
        }else {
            System.out.println("Число не удовлетворяет критериям");
            in.close();
        }
    }

}

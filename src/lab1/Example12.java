package lab1;

import java.time.Year;
import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите свой возраст:");
        int age = in.nextInt();
        int currentYear = Year.now().getValue();
        int yearBirth = currentYear - age;
        System.out.println("Ваш год рождения: " + yearBirth);
        in.close();
    }
}

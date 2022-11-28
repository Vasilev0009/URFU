package Lab1;

import java.time.Year;
import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите своё имя и год рождения:");
        String name = in.nextLine();
        int yearBirth = in.nextInt();
        int currentYear = Year.now().getValue();
        int age = currentYear - yearBirth;
        System.out.println("Имя: " + name + " Возраст: " + age);
        in.close();
    }
}

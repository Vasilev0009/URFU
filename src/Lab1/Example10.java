package Lab1;

import java.time.Year;
import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int currentYear = Year.now().getValue();
        System.out.println("Введите год своего рождения");
        int birthYear = in.nextInt();
        int age = currentYear - birthYear;
        System.out.println("Ваш возвраст: " + age);
        in.close();
    }
}

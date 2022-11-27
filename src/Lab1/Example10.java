package Lab1;

import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текущий год");
        int currentYear = in.nextInt();
        System.out.println("Введите год своего рождения");
        int birthYear = in.nextInt();
        int age = currentYear - birthYear;
        System.out.println("В этом году был день рождения?");
        String birthDay = in.nextLine();
    }
}

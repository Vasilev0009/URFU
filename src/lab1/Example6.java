package lab1;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите свою фамилию:");
        String lastName = in.nextLine();
        System.out.println("Введите своё имя:");
        String firstName = in.nextLine();
        System.out.println("Введите своё отчество:");
        String patronymic = in.nextLine();
        System.out.println("Hello " + lastName + " " + firstName + " " + patronymic);
        in.close();
    }
}

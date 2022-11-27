package Lab1;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите своё имя:");
        String name = in.nextLine();
        System.out.println("Введите свой возраст:");
        int age = in.nextInt();
        System.out.println("Имя : " + name + ", возраст: " + age);
    }
}

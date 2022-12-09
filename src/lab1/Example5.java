package lab1;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Inpute name:");
        String name = in.nextLine();
        System.out.println("Inpute age:");
        int age = in.nextInt();
        System.out.println("Inpute height:");
        float height = in.nextFloat();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        in.close();
    }
}

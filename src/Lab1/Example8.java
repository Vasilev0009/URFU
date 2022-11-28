package Lab1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Какой сегодня день недели?");
        String dayWeek = in.nextLine();
        System.out.println("Какой сейчас месяц?");
        String montch = in.nextLine();
        System.out.println("Какой сегодня день месяца?");
        int day = in.nextInt();
        System.out.println("Сегодня: " + day + " " + montch + " " + dayWeek);
        in.close();
    }
}

package Lab1;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название месяца");
        String montch = in.nextLine();
        System.out.println("Введите количество дней в " + montch);
        int day = in.nextInt();
        System.out.println(montch + " содержит " + day + " день");
    }
}

package timus;

import java.util.Scanner;

public class Task_1877 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int lock1, lock2;
        lock1 = in.nextInt();
        lock2 = in.nextInt();
        in.close();
        if (lock1 % 2 == 0 || lock2 % 2 != 0) {
            System.out.print("yes");
        } else {
            System.out.print("no");
        }
    }
}
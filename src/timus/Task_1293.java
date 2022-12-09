package timus;

import java.util.Scanner;

public class Task_1293 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int weight = n * a * b * 2;
        System.out.println(weight);
        in.close();
    }
}

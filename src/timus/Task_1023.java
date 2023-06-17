package timus;

import java.util.Scanner;

public class Task_1023 {

        public static void main(String[] args) {
            int a = 3;
            int b;

            Scanner in = new Scanner(System.in);
            b = in.nextInt();
            while (b % a != 0) {
                a++;
            }
            System.out.println(a - 1);
        }
}

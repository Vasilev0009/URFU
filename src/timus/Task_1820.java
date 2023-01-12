package timus;

import java.util.Scanner;

public class Task_1820 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        if (k>n){
            System.out.println(2);}
        else {
            n *= 2;
            int time;
            time = n / k;
            if (n % k != 0) {
                ++time;
            }
            System.out.println(time);
        }
    }
}

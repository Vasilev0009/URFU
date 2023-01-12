package timus;


import java.util.Scanner;

public class Task_1725 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        String count = null;
        n=in.nextInt();
        in.close();

        if (n >= 1 && n <= 4) {count = "few";}
        else if (n >= 5 && n <= 9) {count = "several";}
        else if (n >= 10 && n <= 19) {count = "pack";}
        else if (n >= 20 && n <= 49) {count = "lots";}
        else if (n >= 50 && n <= 99) {count = "horde";}
        else if (n >= 100 && n <= 249) {count = "throng";}
        else if (n >= 250 && n <= 499) {count = "swarm";}
        else if (n >= 500 && n <= 999) {count = "zounds";}
        else if (n >= 1000) {count = "legion";}
        System.out.print(count);
    }
}

package timus;

import java.util.Scanner;

public class Task_1283 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double gold = in.nextInt();
        double minGold = in.nextInt();
        double comm = in.nextInt();
        int years = 0;
        double k = (100-comm)/100;

        while (gold > minGold) {
            years++;
            gold *= k;
        }

        System.out.println(years);
    }
}

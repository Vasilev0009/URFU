package Timus;

import java.util.Scanner;

public class Task_2100 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), plusOne = 0;
        in.nextLine();
        String[] name = new String[n];
        for (int i = 0; i < n; ++i) {
            name[i] = in.nextLine();
            if (name[i].contains("+")){
                ++plusOne;
            }
        }
        int all = 2 + n + plusOne;
        if (all == 13){
            ++all;}
        System.out.println( all*100);
        in.close();
    }
}

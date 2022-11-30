package Timus;

import java.util.Scanner;

public class Task_2100 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        String[] name = new String[n];
        for (int i = 0; i < n; ++i) name[i] = in.nextLine();
        in.close();
    }
}

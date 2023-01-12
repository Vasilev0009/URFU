package timus;

import java.util.Scanner;

public class Task_1264 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N,M;
        N=in.nextInt();
        M=in.nextInt();
        in.close();
        int time = N*(M+1);
        System.out.print(time);
    }
}

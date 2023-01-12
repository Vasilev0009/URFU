package timus;

import java.util.Scanner;

public class Task_1639 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N,M;
        N=in.nextInt();
        M=in.nextInt();
        in.close();
        int result = (N*M)%2;
        if (result == 0){
            System.out.print("[:=[first]");
        }
        else {

            System.out.print("[second]=:]");
        }
    }
}
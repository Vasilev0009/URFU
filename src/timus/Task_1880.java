package timus;

import java.util.Scanner;

public class Task_1880 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a, b, c;
        int count = 0;
        a = in.nextInt();
        long[] numA = new long[a];
        for (int i = 0; i < a; i++) {
            numA[i] = in.nextLong();
        }
        b = in.nextInt();
        long[] numB = new long[b];
        for (int i = 0; i < b; i++) {
            numB[i] = in.nextLong();
        }
        c = in.nextInt();
        long[] numC = new long[c];
        for (int i = 0; i < c; i++) {
            numC[i] = in.nextLong();
        }

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (numA[i] == numB[j]) {
                    for (int k = 0; k < c; k++) {
                        if (numB[j] == numC[k]) {
                            count++;
                        }
                    }
                }
            }
        }
        in.close();
        System.out.println(count);
    }
}

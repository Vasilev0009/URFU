package timus;

import java.util.Scanner;

public class Task_1502 {
    public static void main(String[] args) {
        Scanner in = new Scanner( System.in );
        int n = in.nextInt();
        long Diamonds = 0;
        for ( int i = 0; i <= n; i++ ) {
            for ( int j = 0; j <= n; j++ ) {
                if ( j >= i ) {
                    Diamonds += i + j;
                }
            }
        }
        System.out.println( Diamonds );
    }
}

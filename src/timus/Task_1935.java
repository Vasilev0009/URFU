package timus;

import java.util.Arrays;
import java.util.Scanner;

public class Task_1935 {
    public static void main(String[] args) {
        Scanner in = new Scanner( System.in );
        int[] array = new int[in.nextInt()];
        for ( int i = 0; i < array.length; i++ ) {
            array[i] = in.nextInt();
        }
        Arrays.sort(array);
        int sum = Arrays.stream(array).sum();

        System.out.println( array[array.length-1] + sum );
    }
}

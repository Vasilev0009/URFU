package timus;

import java.util.Scanner;

public class Task_1255 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();
        int res;

        int i = 2*(n%k)-k;
        if(i<0) i=0;
        if(n<k) res = 0;
        else res = (n/k)*(n+n%k)+i;

        System.out.println(res);
    }
}

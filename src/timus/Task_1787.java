package timus;

import java.util.Scanner;

public class Task_1787 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int k,n;
        int sum = 0;
        k=in.nextInt();
        n=in.nextInt();
        int [] CarArray = new int [n];
        for (int i=0; i<n;i++){
            CarArray[i]=in.nextInt();
            sum += CarArray[i]-k;
            if (sum<0){
                sum=0;}
        }
        in.close();
        System.out.print(sum);
    }
}

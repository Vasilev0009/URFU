package timus;

import java.util.Scanner;

public class Task_1910 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] powerMagic = new int[in.nextInt()];
        int MaxWall = 0;
        powerMagic[0] = in.nextInt();
        powerMagic[1] = in.nextInt();
        int sum = 0;
        for (int i = 2; i < powerMagic.length; ++i) {
                powerMagic[i] = in.nextInt();
                int tempSum = powerMagic[i-1] + powerMagic[i] + powerMagic[i-2];
                if (sum < tempSum) {
                    sum = tempSum;
                    MaxWall = i;
                }
            }
        System.out.println(sum + " " + MaxWall);
    }
}

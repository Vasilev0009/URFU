package timus;

import java.util.*;

import static java.lang.Math.sqrt;


public class Task_1001 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Double> input = new ArrayList<>();
        while (in.hasNextDouble()) {
            input.add(sqrt(in.nextDouble()));
        }
        for (int i = input.size() - 1; i >= 0; i--) {
            System.out.printf("%.4f", input.get(i));
            System.out.println();
        }
    }
}

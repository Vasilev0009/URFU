package lab4;

import java.util.Scanner;

// Напишите программу, в которой создается двумерный массив, который выводит прямоугольный треугольник
public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите длинну катета прямоугольного треугольника: ");
        int cathet1 = in.nextInt();
        char[][] triangle = new char[cathet1][cathet1];
        int cathet2 = cathet1;

        for (int i = 0; i < cathet1; i++){

            for(int k = cathet2 - 1; k <=cathet1-1 ; k++){
                triangle[i][k] = '+';
                System.out.print(triangle[i][k]);
            }
            cathet2 = cathet2 - 1;
            System.out.println(" ");
        }
    }
}

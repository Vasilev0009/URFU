package lab4;

import java.util.Scanner;
//Напишите программу, в которой создается двумерный массив, который выводит прямоугольник из цифр 2
public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите длинну прямоугольника :");
        int length = in.nextInt();
        System.out.print("Введите ширину прямоугольника :");
        int width = in.nextInt();
        int[][] rectangle = new int[length][width];

        for(int i=0; i< width; ++i){
            for(int k = 0; k < length; ++k){
                rectangle[k][i] = 2;
                System.out.print(rectangle[k][i]);
            }
            System.out.println(" ");
        }
    }
}
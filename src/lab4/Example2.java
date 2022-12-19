package lab4;

import java.util.Scanner;
//Напишите программу, которая выводит в консольное окно прямоугольный треугольник;
public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите длинну катета прямоугольного треугольника: ");
        int cathet1 = in.nextInt();
        int cathet2 = cathet1;

        for (int i = 1; i <= cathet1; i++){

            for(int j = cathet2; j <=cathet1 ; j++) System.out.print("+");
            cathet2 = cathet2 - 1;
            System.out.println(" ");
        }
    }
}
package lab4;

import java.util.Random;
import java.util.Scanner;
// Напишите программу, в которой создается двумерный целочисленный массив. Он заполняется случайными числами.
//Затем в этом массиве строи и столбцы меняются местами: первая строка становится первым столбцом, вторая строка
//становиться вторым столбцом и так далее. Например, если исходный массив состоял из 3 строк и 5 столбцов,
// то в итоге получаем массив из 5 строк и 3 столбцов.
public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество строк в массиве: ");
        int lines = in.nextInt();
        System.out.print("Введите количество столбцов в массиве: ");
        int columns = in.nextInt();
        int[][] array = new int[lines][columns];
        Random random = new Random();
        System.out.println("Исходный массив: ");
        for (int i = 0; i < lines; i++) {

            for (int j = 0; j < columns; j++) {
                array[i][j] = random.nextInt(100);
                System.out.print(array[i][j]+ " ");
            }
            System.out.println (" ");
        }
        System.out.println ("Транспонированный массив: ");
        int[][] transposedArray = new int[columns][lines];
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < lines; j++) {
                transposedArray[i][j] = array[j][i];
                System.out.print(transposedArray[i][j]+ " ");
            }
            System.out.println (" ");
        }
    }
}

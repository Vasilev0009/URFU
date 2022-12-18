package lab4;

import java.util.Random;
import java.util.Scanner;
//Напишите программу, в которой создается и инициализируется двумерный числовой массив. Затем из этого массива
//удаляется строка и столбец (создается новый массив, в котором по сравнению с исходным удалена одна строка
//и один столбец). Индекс удаляемой строки и индекс удаляемого столбца определяется с помощью генератора случайных чисел.
public class Example6 {
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
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }
        int deleteLines = random.nextInt(lines);
        System.out.println("Удаляемая строка: " + deleteLines);
        int deleteColums = random.nextInt(columns);
        System.out.println("Удаляемый столбец: " + deleteColums);
        int[][] smallArray = new int[lines-1][columns-1];
        System.out.println("Массив с удаленной строкой и столбцом: ");
        for (int i = 0, k = 0; i < lines; i++) {
            if (i != deleteLines) {

                for (int j = 0, l = 0; j < columns; j++) {
                    if (j != deleteColums) {
                        smallArray[k][l] = array[i][j];
                        System.out.print(smallArray[k][l] + " ");
                        ++l;
                    }
                }
                ++k;
                System.out.println(" ");
            }
        }
    }
}
package lab9;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rd = new Random();// создаем переменную класса Random
        // Создаем матрицу (двумерный массив) в диапазоне столбцов и строк от 1 до 10.
        int[][] matrix = new int[rd.nextInt(1, 10)][rd.nextInt(1, 10)];
        // Заполняем матрицу случйными згачениями.
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = rd.nextInt(-100, 100);
            }
        }
        System.out.println("Матрица имеет: " + matrix.length + " столбцов ");
        System.out.print("Выберите  номер столбца: ");
        {
            try {
                int column = scan.nextInt();
                for (int i = 0; i < matrix[column].length; i++) {
                    System.out.println(matrix[column][i]);
                }
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Ошибка: Недопустимое значение столбца");
            }catch (InputMismatchException e) {
                System.out.println("Ошибка: введено не целое число!");
            }
        }
    }
}
//В программе, где требуется из матрицы вывести столбец с номером, заданным с клавиатуры, могут возникать ошибки в следующих случаях:
//–	ввод строки вместо числа;
//–	нет столбца с таким номером.
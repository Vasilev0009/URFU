package lab4;

import java.util.Scanner;
//Напишите программу, в которой создается двумерный числовой массив и этот массив заполняется «змейкой»: сначала
// первая строка (слева направо) затем последний столбец (снизу вверх), вторая строка (слева направо) и так далее.
public class Example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество строк в массиве: ");
        int lines = in.nextInt();
        System.out.print("Введите количество столбцов в массиве: ");
        int columns = in.nextInt();
        int count = 0;
        int[][] array = new int[lines][columns];
        for (int i = 0, l = 1; i < lines; i++, l++) {
            for (int j = 0; j < columns-i; j++) {
                if (j == columns-l){
                    array[i][j] = count;
                    ++count;
                    for(int k = lines-1; k > i; --k){
                        array[k][j] = count;
                        ++count;
                    }
                }
                else {
                    array[i][j] = count;
                    ++count;
                }
            }
        }
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}

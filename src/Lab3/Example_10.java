package Lab3;

import java.util.Random;
import java.util.Scanner;

//Напишите программу, в которой создается целочисленный массив, заполняется случайными числами
// и после этого значения элементов в массиве сортируются в порядке убывания значений.
public class Example_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Введите размер массива: ");
        int arrayLength = in.nextInt();
        byte[] bytes = new byte[arrayLength];
        random.nextBytes(bytes);
        for (int i = 0; i < bytes.length; i++) {
            for (int k = i + 1; k < bytes.length; k++){
                if (bytes[k] > bytes[i]){
                    byte temp = bytes[i];
                    bytes[i] = bytes[k];
                    bytes[k] = temp;
                }
            }
            System.out.print(bytes[i] + " ");
        }
    }
}

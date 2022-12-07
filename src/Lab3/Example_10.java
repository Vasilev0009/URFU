package Lab3;

import java.util.Arrays;
import java.util.Random;

//Напишите программу, в которой создается целочисленный массив, заполняется случайными числами
// и после этого значения элементов в массиве сортируются в порядке убывания значений.
public class Example_10 {
    public static void main(String[] args) {
        Random random = new Random();
        byte[] bytes = new byte[10];
        random.nextBytes(bytes);
        Arrays.sort(bytes);
        for (int i = 0; i < bytes.length; i++) {
            System.out.print(bytes[i] + " ");
        }
    }
}

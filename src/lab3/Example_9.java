package lab3;

import java.util.Random;
import java.util.Scanner;

//Напишите программу, в которой создается массив и заполняется случайными числами.
// Массив отображается в консольном окне.В этом массиве необходимо определить элемент с минимальным значением.
// В частности, программа должна вывести значение элемента с минимальным значением и индекс этого элемента.
// Если элементов с минимальным значением несколько, должны быть выведены индексы всех этих элементов.
public class Example_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Введите размер массива: ");
        int arrayLength = in.nextInt();
        byte[] bytes = new byte[arrayLength];
        random.nextBytes(bytes);
        byte min = bytes[0];
        System.out.println("Элементы массива : ");
        for (byte aByte : bytes) {
            if (min > aByte) min = aByte;
            System.out.print(aByte + " ");
        }
        System.out.println("\nНаименьшее значение элемента массива равно : " + min);
        System.out.print("Индексы элементов с наименьшим значением: ");
        for (int i = 0; i < bytes.length; i++) {
            if (bytes[i] == min) System.out.print("[" + i + "] ");
        }
    }
}

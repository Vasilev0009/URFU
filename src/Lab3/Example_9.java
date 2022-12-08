package Lab3;

import java.util.Random;

//Напишите программу, в которой создается массив и заполняется случайными числами.
// Массив отображается в консольном окне.В этом массиве необходимо определить элемент с минимальным значением.
// В частности, программа должна вывести значение элемента с минимальным значением и индекс этого элемента.
// Если элементов с минимальным значением несколько, должны быть выведены индексы всех этих элементов.
public class Example_9 {
    public static void main(String[] args) {
        Random random = new Random();
        byte[] bytes = new byte[15];
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

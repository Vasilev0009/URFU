package lab11;

import java.util.Random;
import java.util.Scanner;

public class Task3 {
    static Random random = new Random();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int[] arr = new int[in.nextInt()];
        setArray(arr, 0);
        getArray(arr, 0);
    }

    public static void setArray(int[] arr, int n) {
        if (n < arr.length) {
            arr[n] = random.nextInt(1000);
            setArray(arr, n + 1);
        }
    }

    public static void getArray(int[] arr, int n) {
        if (n < arr.length) {
            System.out.print(arr[n] + " ");
            getArray(arr, n + 1);
        }
    }
}
//3. Создать приложение, позволяющее ввести и вывести одномерный массив целых чисел. Для ввода и вывода массива
//разработать рекурсивные методы вместо циклов for.
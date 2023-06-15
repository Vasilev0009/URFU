package lab13;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example6 {
    private static final Object lock = new Object();
    private static int num = 0;
    private static int sum = 0;
    private static final int core = Runtime.getRuntime().availableProcessors();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int[] arr = new int[in.nextInt()];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1000);
        }

        Thread[] thread = new Thread[core];
        System.out.println(Arrays.toString(arr));
        for(int i=0; i<core; i++){
            thread[i] = new Thread(() -> {
                synchronized (lock) {
                    while (num < arr.length) {
                        sum += arr[num];
                        num++;
                        try {
                            lock.wait(10);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        lock.notifyAll();
                    }
                }
            });
        }
        for(int j=0; j<core; j++) {
            thread[j].start();
            try{
                thread[j].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Сумма равна: " + sum);
    }
}
//6.Напишите функцию, которая суммирует элементы в массиве целых чисел при помощи многопоточности.
//Количество потоков должно быть равно количеству ядер процессора.

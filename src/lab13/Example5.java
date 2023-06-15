package lab13;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example5 {
    private static final Object lock = new Object();
    private static int num = 0;
    private static int max = Integer.MIN_VALUE;
    private static final int core = Runtime.getRuntime().availableProcessors();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int[] arr = new int[in.nextInt()];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1000);
        }
        Thread[] th = new Thread[core];

        System.out.println(Arrays.toString(arr));
        for(int i=0; i<core; i++){
            th[i] = new Thread(() -> {
                synchronized (lock) {
                    while (num<arr.length) {
                        if (arr[num] > max) max = arr[num];
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
            th[j].start();
            try{
                th[j].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Максимальный элемент: " + max);
    }
}


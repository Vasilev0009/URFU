package lab13;

public class Example3 {
    private static final Object lock = new Object();
    private static int number = 1;

    public static void main(String[] args) {
        Thread evenThread = new Thread(() -> {
            synchronized (lock) {
                while (number < 11) {
                    if (number % 2 == 0) {
                        System.out.println(Thread.currentThread().getName() + ": " + number);
                        number++;
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    lock.notifyAll();
                }
            }
        });

        Thread oddThread = new Thread(()-> {
            synchronized (lock) {
                while (number < 10) {
                    if (number % 2 != 0) {
                        System.out.println(Thread.currentThread().getName() + ": " + number);
                        number++;
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    lock.notifyAll();
                }
            }
        });

        evenThread.setName("Even Thread");
        oddThread.setName("Odd Thread");

        evenThread.start();
        oddThread.start();
    }
}
//3. Напишите программу, которая создает два потока, которые выводят на экран числа от 1 до 10.
//Первый поток должен выводить только четные числа, а второй поток должен выводить только нечетные числа.
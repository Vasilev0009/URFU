package lab13;

public class Example4 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i < 11; i++) {
            Thread thread = new Thread(new NumberPrintThread(i));
            Thread.sleep(300);
            thread.start();
        }
    }

    private record NumberPrintThread(int threadNumber) implements Runnable {

        @Override
        public void run() {
            System.out.println("Поток " + threadNumber);
        }
    }
}
//Напишите программу, которая создает 10 потоков и каждый поток выводит на экран свой номер.
package timus;

import java.util.Scanner;

public class Task_1068 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        in.close();
        int sum = 0;
        if (a <= 0) {
            for (; a <= 1; a++) {
                sum += a;
            }
        } else {
            for (int i = 0; i <= a; i++) {
                sum += i;
            }
        }
        System.out.print(sum);
    }
}
//Всё, что от вас требуется — найти сумму всех целых чисел, лежащих между 1 и N включительно.
//Исходные данные
//В единственной строке расположено число N, по модулю не превосходящее 10000.
//Результат
//Выведите целое число — ответ задачи.
package Timus;

import java.util.Scanner;

// Ваша программа должна определять, можно ли из двух списков целых чисел выбрать по одному числу так,
// чтобы в сумме они составили 10000.
//Исходные данные
//Состоят из двух списков — одного, потом другого. Формат каждого из этих списков таков:
// в первой строчке записано количество Ni чисел в i-м списке, далее в Ni строчках по одному числу в строке записаны сами списки.
// Выполняются неравенства 1 ≤ Ni ≤ 50000, все элементы списков лежат в диапазоне от –32768 до 32767.
// Первый список упорядочен по возрастанию, второй — по убыванию.
//Результат
//На выходе следует записать YES, если из списков можно выбрать по числу, которые в сумме дадут 10000 и NO в противном случае.
public class Task_1021 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int one = in.nextInt();
        int[] oneList = new int[one];
        for (int i = 0; i < oneList.length; ++i) {
            oneList[i] = in.nextInt();
        }
        int two = in.nextInt();
        int[] twoList = new int[two];
        for (int i = twoList.length -1; i >= 0; --i) {
            twoList[i] = in.nextInt();
        }
        for (int i = 0; i < oneList.length; ++i) {
            for (int k = 0; k < twoList.length; ++k) {
               if ( oneList[i] + twoList[k] == 10000) {
                   System.out.println( "YES");
                   return;
               }
               if ( oneList[i] + twoList[k] > 10000) {
                   System.out.println( "ok");
                   break;
               }
            }
        }
        System.out.println( "NO");
        in.close();
    }
}

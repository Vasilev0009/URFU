package timus;

import java.util.Scanner;

public class Task_2066 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        in.close();
        if(b==0) System.out.print(-c);
        else if(b==1) System.out.print(a-b-c);
        else if (b>0) System.out.print(a-b*c);
    }
}
//Вы наверняка уже знаете, что Алексей — серьёзный математик, и он любит решать серьёзные задачи. Вот ещё одна из этих задач.
//Даны три неотрицательных числа a, b, c. Нужно расставить их в некотором порядке и поставить между ними
//знаки +, − или × таким образом, чтобы результат получившегося арифметического выражения был минимален. Между каждой
//парой соседних чисел должен быть один знак, унарный минус и скобки использовать нельзя. Приоритет операций
//стандартный (сначала умножение).
//Исходные данные
//Даны целые неотрицательные числа a, b, c в неубывающем порядке (0 ≤ a ≤ b ≤ c ≤ 100), каждое в отдельной строке.
//Результат
//Выведите одно целое число — минимальное значение выражения.
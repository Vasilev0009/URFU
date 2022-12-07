package Lab3;

import java.util.Scanner;
//Напишите программу, в которой пользователем вводится два
//целых числа. Программа выводит все целые числа — начиная с наименьшего
//(из двух введенных чисел) и заканчивая наибольшим (из двух введенных
//чисел). Предложите разные версии программы (с использованием разных
//операторов цикла).
public class Example_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int number1 = in.nextInt();
        System.out.print("Введите второе число: ");
        int number2 = in.nextInt();
        if (number1 < number2){
            for (; number1 <= number2; ++number1) System.out.print(number1 +" ");
        }
        else {
            while (number2 <= number1){
                System.out.print(number2 + " ");
                ++number2;
            }
        }
        in.close();
    }
}
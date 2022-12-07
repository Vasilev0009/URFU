package Lab3;

import java.util.Scanner;
//Напишите программу, в которой вычисляется сумма чисел,удовлетворяющих таким критериям:
// при делении числа на 5 в остатке получается 2, или при делении на 3 в остатке получается 1.
// Количество чисел в сумме вводится пользователем. Программа отображает числа, которые суммируются, и значение суммы.
// Предложите версии программы, использующие разные операторы цикла.
public class Example_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество чисел в сумме: ");
        int numbers = in.nextInt(), i = 0, sum = 0;
        for (int k=1; k <= numbers; ++i){
            if(i % 5 == 2 || i % 3 == 1){
                if (k == numbers) System.out.print(i);
                else {
                    System.out.print(i + " + ");
                }
                sum += i;
                ++k;
            }
        }
        System.out.print(" = " + sum);
        in.close();
    }
}

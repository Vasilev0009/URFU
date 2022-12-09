package lab3;

import java.util.Scanner;

//Напишите программу, в которой создается одномерный числовой
//массив и заполняется числами, которые при делении на 5 дают в остатке 2
//(числа 2, 7,12,17 и так далее). Размер массива вводится пользователем.
//Предусмотреть обработку ошибки, связанной с вводом некорректного значения.
public class Example_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arrayLength;
        while (true) {
            System.out.print("Введите размер массива: ");
            try {
                arrayLength = Integer.parseInt(in.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Введено неверное значение");
            }
        }
        int i = 0;
        int[] array = new int[arrayLength];
        for (int k=0; k < array.length; ++i){
            if(i % 5 == 2){
                array[k] = i;
                System.out.print(array[k] + " ");
                ++k;
            }
        }
        in.close();
    }
}

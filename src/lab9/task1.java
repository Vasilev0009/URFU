package lab9;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        int cont;         //Длина массива
        int medSum = 0;   //Среднее значение
        int devider = 0;  //Сумма положительных чисел

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        try{
            cont = scan.nextInt();
            int[] arrayInt = new int[cont];
            System.out.println("Введите целые положительные числа:");
            for(int i = 0; i < arrayInt.length; ++i){
                int inInt = scan.nextInt();
                arrayInt[i] = inInt;
                if (inInt > 0) {
                    devider ++;
                    medSum = medSum + arrayInt[i];
                }
            }
            medSum = medSum/devider;
            System.out.println("Среднее значение равно: " + medSum);

        }catch (ArithmeticException e){
            System.out.println("Ошибка: Отсутствуют положительные элементы массива");
        }
        catch (RuntimeException e){
            System.out.println("Ошибка: введено не целое число!");
        }
}
    }
//В программе, вычисляющей среднее значение среди положительных элементов одномерного массива (тип элементов int), вводимого с клавиатуры, могут возникать ошибки в следующих случаях:
//–	ввод строки вместa числа;
//–	несоответствие числового типа данных;
//–	положительные элементы отсутствуют.
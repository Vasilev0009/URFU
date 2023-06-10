package lab9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        int sumByte = 0; //Сумма элементов в одномерном массиве
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите разме массива: ");
        try {
            byte[] sum = new byte[scan.nextInt()];
            System.out.println("Введиет значения элементов массива: ");
            for (byte valueForArray : sum) {
                valueForArray = scan.nextByte();
                sumByte =  sumByte + valueForArray;
                if ((sumByte < -128) || sumByte > 127) {
                    throw new NumberFormatException();
                }
            }
            System.out.println("Сумма элементов равна: " + sumByte);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: cумма элементов выходит за границы допустимого значения переменной");
        } catch (NegativeArraySizeException e) {
            System.out.println("Ошибка: размер массива должен быть положительным");
        }catch (InputMismatchException e) {
            System.out.println("Ошибка: введите целое число");
        }
    }
}

//В программе, вычисляющей сумму элементов типа byte одномерного массива, вводимого с клавиатуры, могут возникать ошибки в следующих случаях:
//–	ввод строки вместо числа;
//–	ввод или вычисление значения за границами диапазона типа.
package Lab3;

import java.util.Scanner;
//Напишите программу, в которой создается одномерный символьный массив из 10 элементов.
// Массив заполняется буквами «через одну», начиная с буквы ' а ': то есть массив заполняется буквами ' а ' ,
// ' с ' , ' е ' ,' g ' и так далее. Отобразите массив в консольном окне в прямом и обратном.
// Размер массива задается переменной.
public class Example_7 {
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
        char alfavit = 'a';
        char[] array = new char[arrayLength];
        for (int i = 0; i < array.length; ++i) {
            array[i] = alfavit;
            alfavit = (char) (alfavit + 2);
            System.out.print(array[i] + " ");
        }
        System.out.println("\nМассив в обратном порядке:");
        for (int i = array.length - 1; i >= 0; --i) {
            System.out.print(array[i] + " ");
        }
        in.close();
    }
}

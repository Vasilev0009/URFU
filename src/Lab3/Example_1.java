package Lab3;

import java.util.Scanner;

//Напишите программу, в которой пользователь вводит целое число
//в диапазоне от 1 до 7, а программа определяет по этому числу день недели.
//Если введенное пользователем число выходит за допустимый диапазон,
//выводится сообщение о том, что введено некорректное значение. Используйте
//оператор выбора switch.
public class Example_1 {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        System.out.println("Введите  целое число  в диапозоне от 1 до 7:");
        int day = userIn.nextInt();

    }
}

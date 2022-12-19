package lab4;

import java.util.Arrays;
import java.util.Scanner;
//Напишите программу «Шифр Цезаря», которая зашифровывает введенный текст. Используете кодовую таблицу символов.
//При запускепрограммы в консоль необходимо вывести сообщение: «Введите текст для шифрования», после ввода текста,
//появляется сообщение: «Введите ключ». После того как введены все данные, необходимо вывести преобразованную строку
//с сообщением «Текст после преобразования : ». Далее необходимо задать вопрос пользователю: «Выполнить обратное
//преобразование? (y/n)»,если пользователь вводит «y», тогда выполнить обратное преобразование. Если пользователь
//вводит «n», того программа выводит сообщение «До свидания!». Если пользователь вводит что-то другое, отличное
//от «y» или «n»,то программа ему выводит сообщение: «Введите корректный ответ».
public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите текст для шифрования: ");
        String text = in.nextLine();
        System.out.print("Введите ключ: ");
        int shift = in.nextInt();

        char[] arrayChar = text.toCharArray();
        for (int i = 0; i < arrayChar.length; i++) {
            arrayChar[i] = (char) (arrayChar[i] + shift);
        }
        System.out.println(Arrays.toString(arrayChar));
        String answer;
        while (true) {
            System.out.print("Выполнить обратное преобразование? (y/n)");
            answer = in.next();
            if (answer.equalsIgnoreCase("y")){
                for (int i = 0; i < arrayChar.length; i++) {
                    arrayChar[i] = (char) (arrayChar[i] - shift);
                }
                String charToString = new String(arrayChar);
                System.out.println(charToString);
                break;
            }
            else if (answer.equalsIgnoreCase("n")){
                System.out.println("До свидания!");
                break;
            }
            else {
                System.out.println("Введите корректный ответ");
            }
        }
    }
}
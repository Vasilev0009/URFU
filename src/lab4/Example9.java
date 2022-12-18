package lab4;

import java.util.Arrays;
import java.util.Scanner;

//Напишите программу «Шифр Цезаря», в которой необходимо реализовать собственный алфавит, остальные условия идентичны задаче 8.
public class Example9 {
    public static void main(String[] args) {
        char[] alphabet = {'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н',
                'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я'};
        Scanner in = new Scanner(System.in);
        System.out.print("Введите текст для шифрования: ");
        String text = in.nextLine();
        System.out.print("Введите ключ: ");
        int shift = in.nextInt();
        char[] arrayChar = text.toCharArray();
        char[] CharCode = new char[arrayChar.length];
        for (int i = 0; i < arrayChar.length; i++) {
            for (int j = 0; j < alphabet.length; j++) {
                if (arrayChar[i] == alphabet[j]) {
                    CharCode[i] = alphabet[(j + shift) % 33];
                } else if (CharCode[i] == 0) {
                    CharCode[i] = '*';
                }
            }

        }
        System.out.println(Arrays.toString(CharCode));
        String answer;
        while (true) {
            System.out.print("Выполнить обратное преобразование? (y/n)");
            answer = in.next();
            if (answer.toLowerCase().equals("y")){
                for (int i = 0; i < arrayChar.length; i++) {
                    arrayChar[i] = (char) (arrayChar[i] - shift);
                }
                System.out.println(Arrays.toString(arrayChar));
                break;
            }
            else if (answer.toLowerCase().equals("n")){
                System.out.println("До свидания!");
                break;
            }
            else {
                System.out.println("Введите корректный ответ");
            }
        }
    }
}
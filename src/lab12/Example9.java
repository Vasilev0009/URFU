package lab12;

import java.util.List;
import java.util.stream.Collectors;

public class Example9 {
    public static void main(String[] args) {
        String string = "Напишите функцию, которая принимает на вход32 список строк и возвращает" +
                " содержащий только те строки, которые6 содержат только буквы (без цифр и символов).";

        List<String> strings = List.of(string.split(" "));
        System.out.println("\nСтрока после сплитования:\n");

        for(String e : strings){
            System.out.println(e);
        }
        List<String> stringsAfter = filterLengthString(strings);

        System.out.println("\nСтрока после преобразования:\n");
        for(String e: stringsAfter){
            System.out.println(e);
        }
    }
    public static List<String> filterLengthString(List<String> list){
        return list.stream()
                .filter(s -> s.chars().allMatch(Character::isLetter))
                .collect(Collectors.toList());
    }
}
//9.Напишите функцию, которая принимает на вход список строк и возвращает новый список,
//содержащий только те строки, которые содержат только буквы (без цифр и символов).
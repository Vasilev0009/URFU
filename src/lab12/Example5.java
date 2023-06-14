package lab12;

import java.util.List;
import java.util.stream.Collectors;

public class Example5 {
    public static void main(String[] args) {
        String string = "Напишите функцию, которая принимает на вход список строк и возвращает" +
                " новый список, содержащий только те строки, которые содержат заданную подстроку.";

        List<String> strings = List.of(string.split(" "));
        System.out.println("\nСтрока после сплитования:\n");

        for(String e : strings){
            System.out.println(e);
        }
        List<String> stringsAfter = filterSearchString(strings, "список");

        System.out.println("\nСтрока после преобразования:\n");
        for(String e: stringsAfter){
            System.out.println(e);
        }
    }
    public static List<String> filterSearchString(List<String> list, String search){
        return list.stream()
                .filter(s -> s.contains(search))
                .collect(Collectors.toList());
    }
}
//5. Напишите функцию, которая принимает на вход список строк и возвращает новый список, содержащий
//только те строки, которые содержат заданную подстроку.
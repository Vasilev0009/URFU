package lab12;

import java.util.List;
import java.util.stream.Collectors;

public class Example3 {
    public static void main(String[] args) {
        String string = "Напишите функцию, которая принимает на вход список строк и возвращает" +
                " новый список, содержащий Только те строки, которые начинаются с большой Буквы.";

        List<String> strings = List.of(string.split(" "));
        System.out.println("\n" + "Строка после сплитования: " + "\n");

        for(String e : strings){
            System.out.println(e);
        }
        List<String> stringsAfter = filterCapitalizedStrings(strings);

        System.out.println("\n" + "Строка после преобразования: " + "\n");
        for(String e: stringsAfter){
            System.out.println(e);
        }
    }
    public static List<String> filterCapitalizedStrings(List<String> list){
        return list.stream()
                .filter(s -> Character.isUpperCase(s.charAt(0)))
                .collect(Collectors.toList());
    }
}
//3. Напишите функцию, которая принимает на вход список строк и возвращает новый список, содержащий
// только те строки, которые начинаются с большой буквы.
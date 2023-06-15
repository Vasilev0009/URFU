package lab11;

import java.util.HashMap;
import java.util.Map;

public class Task5 {
    public static void main(String[] args) {
        // создаем HashMap и заполняем ее 10-ю элементами
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "один");
        hashMap.put(2, "два");
        hashMap.put(3, "три");
        hashMap.put(4, "четыре");
        hashMap.put(5, "пять");
        hashMap.put(6, "шесть");
        hashMap.put(7, "семь");
        hashMap.put(8, "восемь");
        hashMap.put(9, "девять");
        hashMap.put(10, "десять");

        // находим строки, у которых ключ > 5 и выводим их на экран
        System.out.println("Строки, у которых ключ > 5:");
        hashMap.entrySet()
                .stream()
                .filter(e -> e.getKey() > 5)
                .forEach(e -> System.out.println(e.getValue()));

        // выводим строки через запятую, если ключ = 0
        if (hashMap.containsKey(0)) {
            System.out.println("\nСтроки, у которых ключ = 0:");
            String[] values = hashMap.get(0).split(",");
            for (String value : values) {
                System.out.print(value.trim() + " ");
            }
        }

        // перемножаем все ключи, где длина строки > 5
        int product = 1;
        for (String value : hashMap.values()) {
            if (value.length() > 5) {
                product *= hashMap.keySet()
                        .stream()
                        .filter(key -> hashMap.get(key).equals(value))
                        .findFirst()
                        .orElse(1);
            }
        }
        System.out.println("\nПроизведение ключей, где длина строки > 5: " + product);
    }
}


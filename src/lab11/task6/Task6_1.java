package lab11.task6;

import java.util.ArrayList;

public class Task6_1 {
    public static void main(String[] args) {
        int n = 10; // количество человек
        ArrayList<Integer> people = new ArrayList<>(n);

        // заполнение списка людьми
        for (int i = 1; i <= n; i++) {
            people.add(i);
        }

        int i = 0; // индекс текущего человека
        while (people.size() > 1) {
            i = (i + 1) % people.size(); // переход к следующему человеку
            people.remove(i); // удаление каждого второго человека
            i--; // корректировка индекса после удаления элемента
        }

        System.out.println("Остался человек под номером " + people.get(0));
    }
}


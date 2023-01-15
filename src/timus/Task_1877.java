package timus;

import java.util.Scanner;

public class Task_1877 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int lock1, lock2;
        lock1 = in.nextInt();
        lock2 = in.nextInt();
        in.close();
        if (lock1 % 2 == 0 || lock2 % 2 != 0) {
            System.out.print("yes");
        } else {
            System.out.print("no");
        }
    }
}
//У Дена есть два четырёхзначных кодовых замка для велосипеда. Каждый вечер он ставит велосипед на сигнализацию и
//пристёгивает к специальной стойке одним из замков. Ден никогда не использует один и тот же замок два вечера подряд.
//В некоторую ночь злоумышленник попытался с помощью кода 0000 открыть висящий на велосипеде замок. Сработала сигнализация,
//и вор поспешил скрыться. На следующую ночь он решил попробовать код 0001, затем 0002 и так далее в порядке возрастания номера.
//Известно, что Ден не меняет кодов и в ночь, когда вор пришёл впервые, велосипед был пристёгнут первым замком.
//Исходные данные
//В первой строке записан код, установленный на первом замке, во второй строке — код, установленный на втором замке.
//Оба кода — строки длины 4, состоящие из цифр от 0 до 9.
//Результат
//Выведите «yes», если злоумышленник рано или поздно взломает замок, и «no» в противном случае.
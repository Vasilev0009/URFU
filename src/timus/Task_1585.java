package timus;

import java.util.Objects;
import java.util.Scanner;

public class Task_1585 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int e = 0 ,m = 0 ,l =-1;
        for(int i=-1; i<n; i++){
            String pingvin = in.nextLine();
            if (Objects.equals(pingvin, "Emperor Penguin")) e++;
            else if(Objects.equals(pingvin, "Macaroni Penguin")) m++;
            else l++;
        }
        in.close();
        if (e >=m & e >=l) System.out.println("Emperor Penguin");
        else if (m >=e & m >=l) System.out.println("Macaroni Penguin");
        else System.out.println("Little Penguin");
    }
}
//1585. Пингвины
//Ограничение времени: 1.0 секунды
//Ограничение памяти: 64 МБ
//Программист Денис c детства мечтал побывать в Антарктиде, но почему-то регулярных рейсов туда нет. Поэтому Денис все
//лето изучал Антарктиду с помощью соседнего кинотеатра. Теперь он знает, что в Антарктиде водится несколько видов пингвинов:
//Императорские пингвины (Emperor Penguins) — любители петь;
//Малые пингвины (Little Penguins) — любители потанцевать;
//Пингвины Макарони (Macaroni Penguins) — любители сёрфинга.
//К сожалению, в мультфильмах не было сказано, какой вид пингвинов самый многочисленный. Денис решил выяснить это:
//он посмотрел эти мультфильмы еще раз, и каждый раз, когда видел пингвина, записывал в блокнот название его вида.
//Сейчас Денис дал вам блокнот с просьбой выяснить, какой вид пингвинов самый многочисленный.
//Исходные данные
//В первой строке записано целое число n — количество записей в блокноте (1 ≤ n ≤ 1000). В каждой из следующих n строк
//записано по одному виду пингвинов. Среди видов встречаются только «Emperor Penguin», «Little Penguin» и «Macaroni Penguin».
//Результат
//Выведите самый популярный вид пингвинов. Гарантируется, что такой вид только один.
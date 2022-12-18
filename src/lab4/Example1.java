package lab4;
//Напишите программу, которая выводить в консольное окно прямоугольник,
// размеры сторон которого, ширина: 23 колонки, высота: 11 строк;
public class Example1 {
    public static void main(String[] args) {
        int figure = 11;
        int i, j, z;

        for(i = 1; i <=figure; i++){
            System.out.print("номер строоки: " + i + " ");
            z = 0;
            for (j =0; j < 23; j++){
                System.out.print("+");
                z++;
            }
            System.out.println("Количество символов в строке " + z);
        }
    }
}
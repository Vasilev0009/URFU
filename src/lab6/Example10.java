package lab6;
import java.util.Arrays;
//. Напишите программу со статическим методом, аргументом которому передается произвольное количество
//целочисленных аргументов. Результатом метод возвращает массив из двух элементов: это значения
//наибольшего и наименьшего значений среди аргументов, переданных методу.
class Example10 {
    protected static int[] calcMaxMin(int... array){
        Arrays.sort(array);
        int min = array[0];
        int max = array[array.length-1];
        return new int[]{max, min};
    }
}

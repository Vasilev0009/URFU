package lab6;

import java.util.Arrays;

//Напишите программу с классом, в котором есть статические методы, которым можно передавать
//произвольное количество целочисленных аргументов (или целочисленный массив). Методы, на
//основании переданных аргументов или массива, позволяют вычислить: наибольшее значение,
//наименьшее значение, а также среднее значение из набора чисел.
class Example3 {
    private int[] int1;
    public void getMax(int[] int1){
        this.int1 = int1;
        Arrays.sort(int1);
        System.out.println("Элемент с минимальным значением : " + int1[0]);
    }
    public void getMin(int[] int1){
        this.int1 = int1;
        Arrays.sort(int1);
        System.out.println("Элемент с максимальным значением: " + int1[int1.length-1]);
    }
    public void getMed(int[] int1) {
        Arrays.sort(int1);
        int sum = 0;
        int temp = int1[0];
        for (int i = 0; i < int1.length; i++) {
            sum = int1[i] + sum;
        }
        for (int i = 0; i < int1.length; i++) {
            int med = sum/int1.length;
            if (Math.abs(med - int1[i]) < Math.abs(med - temp)) {
                temp = int1[i];
            }
        }
        System.out.println("Элемент с близким к среднему значение: " + temp);
    }
}
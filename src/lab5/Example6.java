package lab5;

import java.util.Arrays;

/*Напишите программу с классом, в котором есть два закрытых целочисленных поля (назовем их max и min).
Значение поля max не может быть меньше значения поля min. Значения полям присваиваются с помощью открытого
метода. Метод может вызываться с одним или двумя целочисленными аргументами. При вызове метода значения полям
присваиваются так: сравниваются текущие значения полей и значения аргументов, переданных методу. Самое большое
из значений присваивается полю max, а самое маленькое из значений присваивается полю min. Предусмотрите конструктор,
который работает по тому же принципу, что и метод для присваивания значений полям. В классе также должен быть метод,
отображающий в консольном окне значения полей объекта.
 */
public class Example6 {
    private int min = 8;
    private int max = 16;
    //Метод с двумя целочисленными аргументами.
    public void SetInt(int number1, int number2){

        System.out.println("Метод c 2-я аргументами");
        int[] array = new int[]{min, max, number1, number2};
        Arrays.sort(array);
        this.min = array[0];
        this.max = array[3];
    }
    //Метод с одним целочисленным аргументом.
    public void SetInt(int number){

        System.out.println("Метод c 1-м аргументом");
        this.min = Math.min(min, number);
        this.max = Math.max(max, number);
    }
    //метод, позволяющий отобразить в консольном окне значение поля min.
    public int getMin() {
        return min;
    }
    //метод, позволяющий отобразить в консольном окне значение поля max.
    public int getMax() {
        return max;
    }
    //конструктор с двумя целочисленными аргументами.
    Example6(int number1, int number2){
        System.out.println("Конструктор c 2-я аргументами");
        int[] array = new int[]{min, max, number1, number2};
        Arrays.sort(array);
        this.min = array[0];
        this.max = array[3];
    }
    //конструктор с одним целочисленным аргументом.
    Example6(int number){
        System.out.println("Конструктор c 1-м аргументом");
        min = Math.min(min, number);
        max = Math.max(max, number);
    }
}

package lab6;
//Напишите программу со статическим методом, аргументом которому передается
//целочисленный массив, а результатом возвращается среднее значение для элементов
//массива (сумма значений элементов, деленная на количество элементов в массиве).
class Example8 {
    protected static double GetArrayMed(int[] Array){
        int sum=0;
        for (int i : Array) {
            sum += i;
        }
        return (double)sum/Array.length;
    }
}
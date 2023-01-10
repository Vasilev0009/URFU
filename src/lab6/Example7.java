package lab6;
//Напишите программу со статическим методом, аргументом которому передастся символьный массив, а
//результатом возвращается ссылка на целочисленным массив, состоящий из кодов символов из массива- аргумента
class Example7 {
    protected int[] convertCharArray(char[] ChArray) {
        int[] intArray = new int[ChArray.length];
        for (int i = 0; i < ChArray.length; i++) {
            intArray[i] = (int)ChArray[i];
        }
        return intArray;
    }
}
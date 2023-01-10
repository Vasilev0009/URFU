package lab6;
//Напишите программу со статическим методом, аргументом которому передается
//одномерный символьный массив. В результате вызова метода элементы массива попарно
//меняются местами: первый — с последним, второй — с предпоследним и так далее.
class Example9 {
    protected char[] ReversArray(char[] ChArray) {
        char changeChar;
        int l = ChArray.length - 1;
        char[] reverseCharArray = new char[ChArray.length];
        for (int i = 0; i < ChArray.length; i++) {
            changeChar = ChArray[i];
            reverseCharArray[i] = ChArray[l - i];
            reverseCharArray[l - i] = changeChar;
        }
        return reverseCharArray;
    }
}

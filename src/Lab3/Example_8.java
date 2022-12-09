package Lab3;
//Напишите программу, в которой создается символьный массив из 10 элементов.
// Массив заполнить большими (прописными) буквами английского алфавита.
// Буквы берутся подряд, но только согласные (то есть гласные буквы ’ А ' , ' Е ' ,
// ' U ' , ' I ' при присваивании значений элементам массива нужно пропустить).
// Отобразите содержимое созданного массива в консольном окне.
public class Example_8 {
    public static void main(String[] args) {
        char[] letters = new char[10];
        char letter = 'A';
        for (int i = 0; i < letters.length; ++i) {
            if(letter == 'A' || letter == 'E' || letter == 'I' || letter == 'U')  ++letter;
            letters[i] = letter;
            ++letter;
            System.out.print(letters[i] + " ");
        }
    }
}

package Lab3;
//Напишите программу, в которой создается символьный массив из 10 элементов.
// Массив заполнить большими (прописными) буквами английского алфавита.
// Буквы берутся подряд, но только согласные (то есть гласные буквы ’ А ' , ' Е ' ,
// ' U ' , ' I ' при присваивании значений элементам массива нужно пропустить).
// Отобразите содержимое созданного массива в консольном окне.
public class Example_8 {
    public static void main(String[] args) {
        char[] bukvi = new char[10];
        char alfavit = 'A';
        for (int i = 0; i < bukvi.length; ++i) {
            if(alfavit == 'A' || alfavit == 'E' || alfavit == 'I' || alfavit == 'U')  ++alfavit;
            bukvi[i] = alfavit;
            ++alfavit;
            System.out.print(bukvi[i] + " ");
        }
    }
}

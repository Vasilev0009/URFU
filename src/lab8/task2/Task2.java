package lab8.task2;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws IOException {
        Writer out;

        try {
            InputStream inFile = new FileInputStream("./src/lab8/Task2/in.txt");
            out = new BufferedWriter(
                    new OutputStreamWriter(
                            new FileOutputStream("./src/lab8/Task2/out.txt")));
            Scanner in = new Scanner(inFile);
            in.nextLine();// Пропускаем первую строку
            String str = in.nextLine();
            double[] num = Arrays.stream(str.split(" ")).mapToDouble(Double::parseDouble).toArray();
               for( int i = 0; i < num.length; i++){
                   if (num[i] >= 0) {
                       out.write(num[i] + " ");
                       System.out.print(num[i] + " ");
                   }
               }
            out.close();
        } catch (IOException e) {
            System.out.println("Ошибка !!!!");
        }
    }
}


//    Создать проект, позволяющий из одного, предварительно
//    созданного программными средствами файла, переписать данные,
//        соответствующие условию - в исходном файле содержится две строки в
//        формате UTF-8 и 5 чисел типа double. В результирующий файл переписать
//        вторую строку и положительные числа.

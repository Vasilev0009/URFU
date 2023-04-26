package lab8;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Example2 {
    // Метод для чтения данных из потока по байтам с выводом
    public static void readALLByByte(InputStream in) throws IOException {
        while (true) {
            int oneByte = in.read(); // читает 1 байт
            if (oneByte != -1) {    // признак отсутсвия конца файла
                System.out.print((char) oneByte);
            } else {
                System.out.print("\n" + "Конец");
            break;}
        }
    }

    public static void main(String[] args) throws IOException {
        try {  //С потоком связан файл
            InputStream inFile = new FileInputStream("C:\\Users\\For URFU\\IdeaProjects\\URFU\\MyFile1.txt");
            readALLByByte(inFile);
            System.out.print("\n\n\n");
            inFile.close();
            //С потоком связана интернет-страница
            InputStream inUrl = new URL("https://ya.ru").openStream();
            readALLByByte(inUrl);
            System.out.print("\n\n\n");
            inUrl.close();
            //С потоком связан массив типа byte
            InputStream inArray = new ByteArrayInputStream(new byte[]{3,4,7,1,9});
            readALLByByte(inArray);
            System.out.print("\n\n\n");
            inArray.close();
        }
        catch (IOException e){
            System.out.println("Ошибка: " + e);

        }

    }
}
//Пример 2. Прочитать и вывести на экран информацию из трех источников:
//файла на диске, интернет-страницы и массива типа byte.
package lab8.task1;

import java.io.*;
import java.net.URL;


public class Example8 {
    public static void readAllByByte(Reader in) throws IOException{
        while (true){
            int oneByte = in.read(); // читает 1 байт
            if (oneByte != -1){ // Признак конца файла
                System.out.print((char) oneByte);
            } else {
                System.out.print("\n" + "конец");
                break;
            }
        }
    }

    public static void main(String[] args) {
        try {
            // С потоком связан файл
            InputStream inFile = new FileInputStream("./src/lab8/Task1/MyFile1.txt"); // Байтовый поток
            Reader rFile = new InputStreamReader(inFile, "cp1251"); // передается русская кодировка

            readAllByByte(rFile);
            System.out.print("\n\n\n");
            inFile.close();
            rFile.close();

            // C потоком связана интернет-страница
            InputStream inUrl = new URL("http://google.com").openStream(); // Байтовый поток
            Reader rUrl = new InputStreamReader(inUrl, "cp1251"); // символьный поток
            readAllByByte(rUrl);
            System.out.print("\n\n\n");
            inUrl.close();
            rUrl.close();
            // С потоком связан массив типа byte

            InputStream inArray = new ByteArrayInputStream(new byte[] {5, 8, 3, 9, 11}); // байтовый поток из массива типа byte
            Reader rArray = new InputStreamReader(inArray, "cp1251"); // символьный поток

            readAllByByte(rArray);
            System.out.print("\n\n\n");
            inArray.close();
            rArray.close();
        } catch (IOException e){
            System.out.println("Ошибка: " + e);
        }
    }
}
//Пример 8. Прочитать и вывести на экран информацию из трех источников: файла
//на диске, интернет-страницы и массива данных типа byte. Указать кодировку,
//поддерживающую кириллицу.
package lab8.task1;

import java.io.*;

public class Example7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter out = null;
        try {
            // Создание файловых символьных потоков для чтения и записи
            br = new BufferedReader( new FileReader("./src/lab8/Task1/MyFile1.txt"), 1024); // 1024 - размер буфера в байтах
            out = new BufferedWriter( new FileWriter("./src/lab8/Task1/MyFile2.txt"));

            int lineCount = 0; // счетчик строк
            String s;
            // Переписывание информации из одного файла в другой
            while ((s = br.readLine()) != null){
                lineCount++;
                System.out.println(lineCount + ": " + s);
                out.write(s);
                out.newLine(); // переход на новую строку
            }
        } catch (IOException e){
            System.out.println("Ошибка !!!!!");
        }
        finally {
            br.close();
            out.flush();
            out.close();
        }
    }
}
//Пример 7. Чтение из одного файла и запись в другой файл данных построчно с использованием буфера в 1 килобайт
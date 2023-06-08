package lab8;

import java.io.*;

public class Example7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter out = null;
        try {
            // Создание файловых символьных потоков для чтения и записи
            br = new BufferedReader( new FileReader("C:\\Users\\For URFU\\IdeaProjects\\URFU\\MyFile1.txt"), 1024); // 1024 - размер буфера в байтах
            out = new BufferedWriter( new FileWriter("C:\\Users\\For URFU\\IdeaProjects\\URFU\\MyFile2.txt"));

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

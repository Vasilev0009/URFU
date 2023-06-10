package lab8.task1;

import java.io.*;

public class Example10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        PrintWriter out = null;

        try {
            //создание потока
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("./src/lab8/Task1/MyFile1.txt"),"cp1251"));

            out = new PrintWriter("./src/lab8/Task1/MyFile2.txt", "cp1251");
            // Переписываем информация из одного файла в другой
            int lineCout = 0;
            String s;

            while ((s = br.readLine()) != null){
                lineCout++;
                out.println(lineCout + ": " + s);
            }

        } catch (IOException e){
            System.out.println("Ошибка !!!!!!");
        }
        finally {
            br.close();
            out.flush();
            out.close();
        }
    }
}

//Пример 10. Выполнить чтение из одного файла и запись в дру- гой
//файл с использованием класса PrintWriter.
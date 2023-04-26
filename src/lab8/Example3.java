package lab8;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class Example3 {
    public static void readAllByArray(InputStream in) throws IOException {
        byte[] buffer = new byte[5];
        while (true) {
            int count = in.read(buffer);
            if (count != -1) {      //Проверка конца файла
                System.out.println("количество= " + count + ",buff=" + Arrays.toString(buffer) + ",str=" + new String(buffer, 0, count, "cp1251"));//UTF8
            } else {
                break;
            }

        }
    }

    public static void main(String[] args) throws IOException {
        String file = "C:\\Users\\For URFU\\IdeaProjects\\URFU\\MyFile1.txt";
        InputStream inFile = null; //переменная объявляется до секции try, чтобы не ограничивать область видимости
        try{
            inFile = new FileInputStream(file);
            readAllByArray(inFile);
        }
        catch (IOException e){
            System.out.println("Ошибка открытия-закрытия файла "+ file + e);
        }
        finally {  //корректное закрытие потока
            if(inFile !=null){
                try{
                    inFile.close();
                }
                catch (IOException ignore){ //NOP - ничего не делать
                }
            }

        }

    }
}
//Пример 3. Прочитать и вывести на экран информацию из предварительно созданного файла с использованием буфера
// в 5 байт.
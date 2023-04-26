package lab8;

import java.io.File;

public class Example1 {
    public static void main(String[] args) {
        try {
            // Создание файла в текущей папке (где расположен файл Example1.java)
            File file1 = new File("MyFile1.txt");
            file1.createNewFile();
            if(file1.exists()){
                System.out.println("Создан!!!");
                System.out.println("Путь к файлу1: " +file1.getAbsolutePath());
            }
            // Создание файла на диске D и вывод полного пути
            File file2 = new File("D://MyFile2.txt");
            file2.createNewFile();
            System.out.println("Путь к файлу1: " +file2.getAbsolutePath());
            // Создание нескольких вложенных папок
            File file3=new File("D:\\folder1\\folder2\\folder3");
            file3.mkdirs();
            System.out.println("Путь к файлу3: "+ file3.getAbsolutePath());
        }
        catch (Exception e){
            System.out.println("Ошибка: " +e);
        }
    }
}
//Пример 1. Создание файлов и папок.
package lab8.task1;

import java.io.*;
import java.util.Scanner;

public class Example4 {
        public static void main(String[] args) {
            try{          // Создание каталога D:\\My
                File directory = new File("./src/lab8/Task1/My");
                directory.mkdirs();
                // Создание исходного файла numIsh.txt и запись в него чисел типа float
                File file1=new File("./src/lab8/Task1/My/numIsh.txt");
                file1.createNewFile();
                Scanner scanner = new Scanner(System.in,"Cp1251");
                DataOutputStream write = new DataOutputStream(new FileOutputStream(file1.getAbsolutePath()));
                System.out.println("Сколько вещественных чисел записать в файл?");
                    int count = scanner.nextInt();
                        System.out.println("Введите числа:");
                for (int i = 0; i < count; i++)
                    write.writeFloat(scanner.nextFloat());
                write.flush();
                write.close();
// Создание файла numRez.txt и переписывание в него чисел из numIsh.txt
                File file2=new File("./src/lab8/Task1/My/numRez.txt");
                file2.createNewFile();
// поток для чтения из исходного файла numIsh.txt
                DataInputStream read = new DataInputStream(new FileInputStream(file1.getAbsolutePath()));
// поток для записи в результирующий файл numRez.txt
                write = new DataOutputStream(new FileOutputStream(file2.getAbsolutePath()));
                try{
                    while(true){
                        float number=read.readFloat();
                        write.writeFloat(number); //чтение-запись из одного файла в другой
                        System.out.println(" Число "+ number);
                    }
                }catch(EOFException e){
                    System.out.println("Error");
                }
                write.flush();
                write.close();
                read.close();
            }catch(IOException e){
                System.out.println("End of file");
            }
        }
}

//Пример 4.Создать первый файл на диске и записать в него заданное
//количество вещественных чисел. Далее создать второй файл и переписать в него
//все числа из первого файла.
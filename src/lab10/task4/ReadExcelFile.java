package lab10.task4;

import org.apache.poi.UnsupportedFileFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadExcelFile {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        while (true) {
            // Открываем файл Excel для чтения
            try {
                System.out.println("Введите путь к файлу: ");
                String filePath = scan.nextLine();
                FileInputStream inputStream = new FileInputStream(filePath);

                // Создаём экземпляр книги Excel из файла
                XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

                // Получаем лист из книги по его имени
                System.out.print("Введите имя листа: ");
                String sheetName = scan.nextLine();
                XSSFSheet sheet = workbook.getSheet(sheetName);
                // Перебираем строки и ячейки листа
                    for (Row row : sheet) {
                        for (Cell cell : row) {
                            // Выводим значение ячейки на экран
                            System.out.print(cell.toString() + "\t");
                        }
                        System.out.println();
                    }

                    // Закрываем файл и освобождаем ресурсы
                    workbook.close();
                    inputStream.close();
                    return;
            } catch (FileNotFoundException e) {
                System.out.println("Не удалось открыть файл Excel: " + e.getMessage());
            } catch (UnsupportedFileFormatException e) {
                System.out.println("Не поддерживаемый формат файла:\n " + e.getMessage());
            } catch (NullPointerException e) {
                System.out.println("Не удалось найти запрашиваемый лист:\n" + e.getMessage());
            }
        }
    }
}
//Выполните следующую доработки проекта Excel парсера
//Улучшение работы с ошибками. Программы, которые читают Excel файлы, могут столкнуться с ошибками,
//такими как неправильный формат файла, отсутствие запрашиваемого листа и т.д. Улучшение работы с ошибками
//может включать более подробные сообщения об ошибках, рекомендации для исправления ошибок и возможность
//повторного запуска программы после исправления ошибок.

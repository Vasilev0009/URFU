package lab10.task2;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

public class JSONParser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Выберите действие: ");
            System.out.println("view - Просмотр списка книг");
            System.out.println("add - Добавление новой книги");
            System.out.println("author - Поиск книги по автору");
            System.out.println("delete - Удаление книги");
            System.out.println("exit - Выход");
            String choice = scan.nextLine();
            switch (choice.toLowerCase()) {
                case "view" -> displayBooks();
                case "add" -> addNewBook();
                case "author" -> searchBooksByAuthor();
                case "delete" -> deleteBook();
                case "exit" -> {
                    scan.close();
                    return;
                }
                default -> System.out.println("Неверный выбор, повторите попытку");
            }
        }
    }

    public static void displayBooks() {
        try {
            org.json.simple.parser.JSONParser parser = new org.json.simple.parser.JSONParser();
            Object obj = parser
                    .parse(new FileReader("src/lab10/task2/example-json.json"));
            JSONObject jsonObject = (JSONObject) obj;
            System.out.println("Корневой элемент: "
                    + jsonObject.keySet().iterator().next());
            JSONArray jsonArray = (JSONArray) jsonObject.get("books");

            for (Object o : jsonArray) {
                JSONObject book = (JSONObject) o;
                System.out.println("\nТекущий элемент: book");
                System.out.println("Название книги: " + book.get("title"));
                System.out.println("Автор: " + book.get("author"));
                System.out.println("Год издания: " + book.get("year"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void addNewBook() {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите название книги: ");
            String title = scan.nextLine();
            System.out.println("Введите автора книги: ");
            String author = scan.nextLine();
            System.out.println("Введите год издания книги: ");
            int year = scan.nextInt();

            org.json.simple.parser.JSONParser parser = new org.json.simple.parser.JSONParser();
            Object obj = parser.parse(new FileReader("src/lab10/task2/example-json.json"));
            JSONObject jsonObject = (JSONObject) obj;
            JSONArray jsonArray = (JSONArray) jsonObject.get("books");

            JSONObject newBook = new JSONObject();
            newBook.put("title", title);
            newBook.put("author", author);
            newBook.put("year", year);
            jsonArray.add(newBook);

            jsonObject.put("books", jsonArray);

            FileWriter fileWriter = new FileWriter("src/lab10/task2/example-json.json");
            fileWriter.write(jsonObject.toJSONString());
            fileWriter.flush();
            fileWriter.close();

            System.out.println("Книга добавлена в массив.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void searchBooksByAuthor(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя автора:");
        String author = scanner.nextLine();
        try {
            org.json.simple.parser.JSONParser parser = new org.json.simple.parser.JSONParser();
            Object obj = parser.parse(new FileReader("src/lab10/task2/example-json.json"));
            JSONObject jsonObject = (JSONObject) obj;
            Object booksObj = jsonObject.get("books");

            JSONArray jsonArray = (JSONArray) booksObj;
            boolean found = false;
            for (Object o : jsonArray) {
                JSONObject book = (JSONObject) o;
                if (book.get("author").equals(author)) {
                    System.out.println("Название книги: " + book.get("title"));
                    System.out.println("Год издания: " + book.get("year"));
                    found = true;
                }
            }
            if (!found) {
                System.out.println("Книги данного автора не найдены.");
            }
        } catch (IOException  | ParseException | RuntimeException e ) {
            e.printStackTrace();
        }
    }
    public static void deleteBook() {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите название книги, которую необходимо удалить: ");
            String title = scan.nextLine();

            org.json.simple.parser.JSONParser parser = new org.json.simple.parser.JSONParser();
            Object obj = parser.parse(new FileReader("src/lab10/task2/example-json.json"));
            JSONObject jsonObject = (JSONObject) obj;
            JSONArray jsonArray = (JSONArray) jsonObject.get("books");

            boolean found = false;
            Iterator<Object> iterator = jsonArray.iterator();
            while (iterator.hasNext()) {
                JSONObject book = (JSONObject) iterator.next();
                if (book.get("title").equals(title)) {
                    iterator.remove();
                    jsonObject.put("books", jsonArray);
                    FileWriter fileWriter = new FileWriter("src/lab10/task2/example-json.json");
                    fileWriter.write(jsonObject.toJSONString());
                    fileWriter.flush();
                    fileWriter.close();
                    System.out.println("Книга удалена из массива.");
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Книга с таким названием не найдена.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
//Выполните следующие доработки проекта JSON парсера:
//1.	Сделайте в текстовом редакторе свой файл в формате JSON в зависимости от варианта (Приложение 1).
//2.	Добавьте функционал для поиска книг по автору.
//3.	Добавьте функционал для добавления новой книги в массив.
//4.	Добавьте функционал для удаления книги из массива по названию.
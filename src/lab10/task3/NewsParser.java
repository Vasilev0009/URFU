package lab10.task3;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class NewsParser {
    public static void main(String[] args) {
        int reconect = 0;
        Document doc = null;
        while (reconect <= 2) {
            try {
                // Получаем HTML-код страницы
                doc = Jsoup.connect("http://fat.urfu.ru/index.html").get();
                reconect = 3;
            } catch (IOException e) {
                System.err.println("Error: failed to connect");
                reconect++;
            }
        }
            if (doc == null){
                return;
            }
            // Извлекаем список новостей
            Elements newsParent = doc.select("body > table > tbody > tr > td > div > table > " +
                    "tbody > tr:nth-child(5) > td:nth-child(3) > table > tbody > " +
                    "tr > td:nth-child(1)");
            // Записываем последние 10 новостей в txt-файл
            try {
                FileWriter writer = new FileWriter("src/lab10/task3/news.txt");
                for (int i = 3; i < 20; i++) {
                    if (!(i % 2 == 0)) {
                        List<Node> nodes = newsParent.get(0).childNodes();
                        String topic = "Тема: " + ((Element) nodes.get(i)).getElementsByClass("blocktitle").get(0).childNodes().get(0);
                        String data = " Дата: " + ((Element) nodes.get(i)).getElementsByClass("blockdate").get(0).childNodes().get(0) + "\n";
                        writer.write(topic +data);
                    }
                }
                writer.close();
            } catch (Exception e) {
                System.err.println("Failed to write to file ");
            }
        }
    }
//Выполните следующие доработки проекта HTML парсера
//
//Доработка парсера новостей:
//1.	Добавьте функционал записи полученных данных в файл для сохранения информации на будущее.
//2.	Добавьте обработку ошибок при получении HTML-кода страницы, например вывод сообщения об ошибке и попытка
// переподключения к сайту.

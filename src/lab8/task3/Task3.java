package lab8.task3;

import java.io.*;
import java.util.Objects;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) throws IOException {
        String sogl = "бвгджзйклмнпрстфхцчшщ";

        InputStream inFile = new FileInputStream("./src/lab8/Task3/in.txt");
        FileWriter outFile = new FileWriter("./src/lab8/Task3/out.txt");
        Scanner in = new Scanner(inFile);
        int lineCounter = 0;
        while (in.hasNextLine()) {
            lineCounter++;
            outFile.write("Строка " + lineCounter + ": ");
            String line = in.nextLine();
            String[] words = line.split("[ .,:;-]");
            int soglWordsCounter = 0;
            for (String word : words) {
                if (Objects.equals(word, "")) continue;
                if (sogl.indexOf(word.toLowerCase().charAt(0)) != -1) {
                    soglWordsCounter++;
                    outFile.write(word + " ");
                }
            }
            outFile.write("\n Кол-во слов в строке: " + soglWordsCounter + "\n\n");
        }
        inFile.close();
        outFile.close();
    }
}

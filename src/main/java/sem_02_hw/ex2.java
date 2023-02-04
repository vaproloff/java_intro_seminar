package sem_02_hw;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/*  Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
    который запишет эту строку в простой текстовый файл, обработайте исключения.
*/
public class ex2 {
    private static final String FILE_PATH = "src/main/java/sem_02_hw/file.txt";

    public static void main(String[] args) {
        Scanner lineScanner = new Scanner(System.in);

        String word = "";
        do {
            System.out.print("Введите слово: ");
            word = lineScanner.nextLine();
        } while (word.isBlank());

        int repeats = 0;
        do {
            System.out.print("Введите количество повторений: ");
            try {
                repeats = Integer.parseInt(lineScanner.next());
                if (repeats <= 0) {
                    System.out.println("Это не положительное число");
                }
            } catch (Exception e) {
                System.out.println("Ошибка! Неверно введено число.");
            }
        } while (repeats <= 0);

        lineScanner.close();
        printStringToFile(multiplyString(word, repeats), FILE_PATH);
    }

    private static String multiplyString(String inputStr, int repeats) {
        return inputStr.repeat(Math.max(0, repeats));
    }

    private static void printStringToFile(String outputStr, String filePath) {
        try(PrintWriter pw = new PrintWriter(filePath)) {
            pw.print(outputStr);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

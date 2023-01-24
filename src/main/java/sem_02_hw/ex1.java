package sem_02_hw;

import java.util.Scanner;

/*  Напишите метод, который принимает на вход строку (String)
    и определяет является ли строка палиндромом (возвращает boolean значение).
*/
public class ex1 {
    public static void main(String[] args) {
        Scanner lineScanner = new Scanner(System.in);
        String inputStr = "";
        do {
            System.out.print("Введите строку: ");
            inputStr = lineScanner.nextLine();
        } while (inputStr.isBlank());
        lineScanner.close();

        System.out.println(checkPalindrom(inputStr) ? "Это палиндром" : "Это не палиндром");
    }

    private static boolean checkPalindrom(String inputStr) {
        StringBuilder line = new StringBuilder();
        line.append(inputStr);
        return line.toString().equals(line.reverse().toString());
    }
}

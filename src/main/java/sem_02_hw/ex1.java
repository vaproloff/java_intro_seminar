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
            inputStr = lineScanner.nextLine().toLowerCase();
        } while (inputStr.isBlank());
        lineScanner.close();

        System.out.println(checkPalindromSB(inputStr) ? "Это палиндром" : "Это не палиндром");
        System.out.println(checkPalindromFor(inputStr) ? "Это палиндром" : "Это не палиндром");
    }

    private static boolean checkPalindromSB(String inputStr) {
        StringBuilder line = new StringBuilder(inputStr);
        return line.toString().equals(line.reverse().toString());
    }

    private static boolean checkPalindromFor(String inputStr) {
        for (int i = 0; i < inputStr.length() / 2; i++) {
            if (inputStr.charAt(i) != inputStr.charAt(inputStr.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}

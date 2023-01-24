package sem_02_cw;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        ex_1();
        ex_2();
    }

    /*  Дано четное число N (>0) и символы c1 и c2.
        Написать метод, который вернет строку длины N, которая
        состоит из чередующихся символов c1 и c2, начиная с c1.
    */
    private static void ex_1() {
        Scanner lineScanner = new Scanner(System.in);
        int n = -1;
        do {
            System.out.print("Введите натуральное число: ");
            try {
                n = lineScanner.nextInt();
            } catch (Exception e) {
                System.out.print("Ошибка! ");
                e.printStackTrace();
            }
        } while (n < 0);

        char c1 = ' ';
        do {
            System.out.print("Введите первый символ: ");
            try {
                c1 = lineScanner.next().charAt(0);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (c1 == ' ');

        char c2 = ' ';
        do {
            System.out.print("Введите второй символ: ");
            try {
                c2 = lineScanner.next().charAt(0);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (c2 == ' ');

        StringBuilder line = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                line.append(c1);
            } else {
                line.append(c2);
            }
        }

        System.out.println(line);
    }

    /*  Напишите метод, который сжимает строку.
        Пример: вход aaaabbbcdd.
    */
    private static void ex_2() {
        Scanner lineScanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String line = lineScanner.next();
        lineScanner.close();

        StringBuilder zippedLine = new StringBuilder();
        char prevChar = ' ';
        int quantity = 1;
        for (int i = 0; i < line.length(); i++) {
            char curChar = line.charAt(i);
            if (curChar == prevChar) {
                quantity++;
            } else {
                if (prevChar != ' ') {
                    zippedLine.append(prevChar);
                    if (quantity != 1) {
                        zippedLine.append(quantity);
                    }
                }
                quantity = 1;
                prevChar = curChar;
            }
        }
        zippedLine.append(prevChar);
        if (quantity != 1) {
            zippedLine.append(quantity);
        }
        System.out.println(zippedLine);
    }
}

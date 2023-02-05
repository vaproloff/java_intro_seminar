package sem_04_hw;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/*  1.Реализовать консольное приложение, которое:
    Принимает от пользователя и “запоминает” строки.
    Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
    Если введено revert, удаляет предыдущую введенную строку из памяти.
*/
public class Ex1 {
    public static void main(String[] args) {
        List<String> strings = new LinkedList<>();
        Scanner lineScanner = new Scanner(System.in);
        String inputLine = "";

        while (true) {
            System.out.println("Введите строку или команду (print, exit, revert):");
            inputLine = lineScanner.nextLine();
            if (inputLine.isBlank()) {
                continue;
            }

            switch (inputLine) {
                case "exit" -> System.exit(0);
                case "print" -> System.out.println(strings);
                case "revert" -> {
                    if (strings.size() > 0) {
                        System.out.printf("Элемент %s удалён из списка%n", strings.remove(0));
                    } else {
                        System.out.println("В списке нет элементов для удаления%n");
                    }
                }
                default -> strings.add(0, inputLine);
            }
        }
    }
}

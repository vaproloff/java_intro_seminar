package sem_04_cw;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<>();

        String inputLine = "";
        Scanner lineScanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите строку вида text~num:");
            try {
                inputLine = lineScanner.nextLine();
            } catch (Exception e) {
                System.out.print("Ошибка!");
                e.printStackTrace();
            }

            if (inputLine.equals("exit")) {
                break;
            } else if (inputLine.equals("print")) {
                System.out.println(inputLine);
            } else if (inputLine.equals("revert")) {
                linkedList.remove(0);
            } else {
                linkedList.add(0, inputLine);
            }

            System.out.println(linkedList);
        }
    }
}

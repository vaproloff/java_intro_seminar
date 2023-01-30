package sem_04_cw;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Ex1 {
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
            }

            String[] splittedInput = inputLine.split("~");
            int index = 0;
            try {
                index = Integer.parseInt(splittedInput[1]);
            } catch (Exception e) {
                System.out.print("Ошибка!");
                e.printStackTrace();
            }
            if (splittedInput[0].equals("print")) {
                if (index < linkedList.size()) {
                    System.out.println(linkedList.remove(index));
                } else {
                    System.out.println("Такого элемента в списке нет");
                }
            } else {
                linkedList.add(Math.min(index, linkedList.size()), splittedInput[0]);
            }
            System.out.println("Список: " + linkedList);
        }
    }
}

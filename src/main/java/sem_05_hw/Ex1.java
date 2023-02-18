package sem_05_hw;

import java.util.*;

/*
    Реализуйте структуру телефонной книги с помощью HashMap,
    учитывая, что 1 человек может иметь несколько телефонов.
*/
public class Ex1 {
    private static final Scanner lineScanner = new Scanner(System.in);

    private static final Map<String, ArrayList<String>> phoneBook = new HashMap<>();

    public static void main(String[] args) {
        while (true) {
            String mode = askForInput("Введите команду (add, print, search, exit):").toLowerCase();
            switch (mode) {
                case "add" -> addNewRecord();
                case "print" -> printPhoneBook();
                case "search" -> searchRecord();
                case "exit" -> System.exit(0);
            }
        }
    }

    private static String askForInput(String request) {
        String inputLine = "";
        while (inputLine.isBlank()) {
            System.out.println(request);
            inputLine = lineScanner.nextLine();
        }
        return inputLine;
    }

    private static String askForNumber() {
        String inputLine = "";
        while (true) {
            System.out.println("Введите номер телефона:");
            inputLine = lineScanner.nextLine();
            if (inputLine.matches("\\+?[1-9]\\d{6,14}")) {
                return inputLine;
            } else {
                System.out.print("Номер телефона введен неверно. ");
            }
        }

    }

    private static void addNewRecord() {
        String name = askForInput("Введите имя/фамилию:");
        if (phoneBook.containsKey(name)) {
            if (askForInput("Такой контакт уже есть, хотите добавить новый номер? y/n:")
                    .equalsIgnoreCase("y")) {
                phoneBook.get(name).add(askForNumber());
            }
        } else {
            ArrayList<String> phoneRecord = new ArrayList<>();
            phoneRecord.add(askForNumber());
            phoneBook.put(name, phoneRecord);
        }
    }

    private static void printPhoneBook() {
        if (phoneBook.isEmpty()) {
            System.out.println("Телефонная книга пуста");
        }
        for (String name: phoneBook.keySet()) {
            printRecord(name);
        }
    }

    private static void printRecord(String name) {
        System.out.println(name + ": " + phoneBook.get(name).toString());
    }

    private static void searchRecord() {
        String searchRequest = askForInput("Введите запрос для поиска:");
        boolean isFound = false;
        for (String name: phoneBook.keySet()) {
            if (name.contains(searchRequest)) {
                isFound = true;
                printRecord(name);
            } else {
                for (String phone: phoneBook.get(name)) {
                    if (phone.contains(searchRequest)) {
                        isFound = true;
                        printRecord(name);
                        break;
                    }
                }
            }
        }
        if (!isFound) {
            System.out.printf("Ничего не найдено по запросу %s%n", searchRequest);
        }
    }
}

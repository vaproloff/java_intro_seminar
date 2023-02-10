package sem_06_hw;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final Scanner lineScanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<Laptop> laptops = new ArrayList<>();
        generateLaptops(laptops);

        List<Laptop> filteredLaptops = filterLaptops(laptops);
        System.out.printf("Найдено моделей: %d%n", filteredLaptops.size());
        for (Laptop laptop: filteredLaptops) {
            System.out.println(laptop);
        }
    }

    private static List<Laptop> filterLaptops(List<Laptop> laptops) {
        List<Laptop> filteredLaptops = new ArrayList<>();

        int ramSize = askForNumber("Минимальный объем оперативной памяти: ");
        int romSize = askForNumber("Минимальный объем накопителя: ");
        System.out.println("Цвет (если неважно - оставьте пустым): ");
        String color = lineScanner.nextLine();

        for (Laptop laptop: laptops) {
            if (laptop.getRamSize() < ramSize) { continue; }
            if (laptop.getRomSize() < romSize) { continue; }
            if (!color.isBlank() && !laptop.getColor().equalsIgnoreCase(color)) {
                continue;
            }
            filteredLaptops.add(laptop);
        }
        return filteredLaptops;
    }

    private static int askForNumber(String request) {
        String inputLine = "";
        int inputNumber = -1;
        while (inputNumber < 0) {
            System.out.print(request);
            inputLine = lineScanner.nextLine();
            if (inputLine.isBlank()) {
                inputNumber = 0;
                break;
            }
            try {
                inputNumber = Integer.parseInt(inputLine);
            } catch (NumberFormatException e) {
                System.out.println("Число введено неверно");
            }
        }
        return inputNumber;
    }

    private static void generateLaptops(List<Laptop> laptops) {
        laptops.add(new Laptop("Apple", "Macbook Air 2022", "Silver",
                "Apple M2", 8, 256, 13.3, true, false));
        laptops.add(new Laptop("Huawei", "MateBook D BoD-WDH9", "White",
                "Intel Core i5 1135G7",8, 512, 15.6, true, false));
        laptops.add(new Laptop("ASUS", "Vivobook M1502I", "Black",
                "AMD Ryzen 5 4600H", 16, 1000, 15.6, false, true));
        laptops.add(new Laptop("Acer", "Aspire 3 A315-23-R91S", "Silver",
                "AMD Ryzen 5 3500U", 8, 1000, 15.6, false, false));
        laptops.add(new Laptop("ASUS", "Vivobook Go 15 E510MA-BQ509W", "Blue",
                "Intel Celeron N4020", 4, 128, 14.4, true, false));
        laptops.add(new Laptop("Huawei", "MateBook D 16 RLEF-X", "Black",
                "Intel Core i7 12700H", 16, 512, 14.4, true, false));
        laptops.add(new Laptop("MSI", "Titan GT77 12UHS-208RU", "Black",
                "Intel Core i9 12900HX", 64, 3072, 17.3, true, true));
        laptops.add(new Laptop("Apple", "Macbook Pro 2021", "Space Gray",
                "Apple M1 Max", 32, 1024, 16, true, false));
    }
}

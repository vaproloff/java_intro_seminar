package sem_05_hw;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/*  Пусть дан список сотрудников.
    Написать программу, которая найдет и выведет повторяющиеся имена
    с количеством повторений. Отсортировать по убыванию популярности.
*/
public class Ex2 {
    private static final String[] workers = {"Иван Иванов", "Светлана Петрова", "Кристина Белова",
                                            "Анна Мусина", "Анна Крутова", "Иван Юрин",
                                            "Петр Лыков", "Павел Чернов", "Петр Чернышов",
                                            "Мария Федорова", "Марина Светлова", "Мария Савина",
                                            "Мария Рыкова", "Марина Лугова", "Анна Владимирова",
                                            "Иван Мечников", "Петр Петин", "Иван Ежов"};

    public static void main(String[] args) {
        Map<String, Integer> namePopularity = new HashMap<>();
        String name = "";

        for (String worker: workers) {
            name = worker.split(" ")[0];
            if (namePopularity.containsKey(name)) {
                namePopularity.put(name, namePopularity.get(name) + 1);
            } else {
                namePopularity.put(name, 1);
            }
        }

        namePopularity.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(System.out::println);
    }
}

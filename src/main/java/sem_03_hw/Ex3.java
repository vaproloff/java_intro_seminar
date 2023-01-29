package sem_03_hw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

/*  Пройти по списку из задания 2 с урока и удалить повторяющиеся элементы.
 */
public class Ex3 {
    private static final String[] solarSystemPlanets =
            {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};

    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<String> planetList = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            planetList.add(solarSystemPlanets[random.nextInt(solarSystemPlanets.length)]);
        }
        System.out.println("Cписок с повторениями:");
        System.out.println(planetList);
        printListFrequency(planetList);

//        Вариант решения 1 - через метод удаления повторений:
        removeRepeats(planetList);
        System.out.println("Cписок уникальных элементов:");
        System.out.println(planetList);

//        Вариант решения 2 - через Set:
//        Set<String> uniquePlanetSet = new HashSet<>(planetList);
//        System.out.println("Cписок уникальных элементов:");
//        System.out.println(uniquePlanetSet);
    }

    private static void printListFrequency(ArrayList<String> planetList) {
        System.out.println("Количество элементов:");
        for (String planet: Ex3.solarSystemPlanets) {
            System.out.printf("%8s\t%d%n", planet, Collections.frequency(planetList, planet));
        }
    }

    private static void removeRepeats(ArrayList<String> planetList) {
        if (!planetList.isEmpty()) {
            planetList.sort(Comparator.naturalOrder());
            String repeatedElement = "";
            int index = 0;
            while (index < planetList.size()) {
                if (planetList.get(index).equals(repeatedElement)) {
                    planetList.remove(index);
                } else {
                    repeatedElement = planetList.get(index);
                    index++;
                }
            }
        }
    }
}

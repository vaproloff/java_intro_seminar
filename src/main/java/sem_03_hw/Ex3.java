package sem_03_hw;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
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
        List<String> planets = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            planets.add(solarSystemPlanets[random.nextInt(solarSystemPlanets.length)]);
        }
        System.out.println("Cписок с повторениями:");
        System.out.println(planets);
        printListFrequency(planets);

        System.out.println("Cписок уникальных элементов (способ 1):");
        System.out.println(removeRepeats1(planets));

        removeRepeats2(planets);
        System.out.println("Cписок уникальных элементов (способ 2):");
        System.out.println(planets);

        System.out.println("Cписок уникальных элементов (способ 3):");
        System.out.println(removeRepeats3(planets));
    }

    private static void printListFrequency(List<String> planetList) {
        System.out.println("Количество элементов:");
        for (String planet: Ex3.solarSystemPlanets) {
            System.out.printf("%8s\t%d%n", planet, Collections.frequency(planetList, planet));
        }
    }

    private static Set<String> removeRepeats1(List<String> planetList) {
        return new HashSet<>(planetList);
    }

    private static void removeRepeats2(List<String> planetList) {
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

    private static List<String> removeRepeats3(List<String> planets) {
        return planets.stream().distinct().toList();
    }
}

package sem_03_cw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.TreeSet;

public class ex2 {
    public static String[] solarSystemPlanets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};

    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<String> planetList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            planetList.add(solarSystemPlanets[random.nextInt(solarSystemPlanets.length)]);
        }

        for (String planet: solarSystemPlanets) {
            System.out.printf("%8s\t%d%n", planet, Collections.frequency(planetList, planet));
        }

        TreeSet<String> uniquePlanetSet = new TreeSet<>(planetList);
        System.out.println(uniquePlanetSet);
    }
}

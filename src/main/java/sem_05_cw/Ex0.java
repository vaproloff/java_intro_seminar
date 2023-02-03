package sem_05_cw;

import java.util.Collections;
import java.util.HashMap;

public class Ex0 {
    public static void main(String[] args) {
        HashMap<Integer, String> people = new HashMap<>();
        people.put(123456, "Иванов");
        people.put(321456, "Васильев");
        people.put(234561, "Петрова");
        people.put(234432, "Иванов");
        people.put(654321, "Петрова");
        people.put(345678, "Иванов");

        for (int passNum: people.keySet()) {
            if (people.get(passNum).equals("Иванов")) {
                System.out.printf("%d: %s%n", passNum, people.get(passNum));
            }
        }

    }
}

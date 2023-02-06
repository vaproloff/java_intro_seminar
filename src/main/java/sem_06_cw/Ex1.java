package sem_06_cw;

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Ex1 {
    public static void main(String[] args) {
        Integer[] numbers = new Integer[1000];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(1001);
        }

        Set<Integer> uniqueNumbers = new HashSet<>(List.of(numbers));
        double uniquesPercent = (double)uniqueNumbers.size() * 100 / numbers.length;
        System.out.println("Количество уникальных значений: " + uniquesPercent + "%");
    }
}

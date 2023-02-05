package sem_03_hw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;

/*  Задан целочисленный список ArrayList.
    Найти минимальное, максимальное и среднее арифметическое из этого списка.
*/
public class Ex2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            numbers.add(random.nextInt(1000));
        }
        System.out.println("Список:");
        System.out.println(numbers);

        printStats1(numbers);
        printStats2(numbers);
    }

    private static void printStats1(List<Integer> numList) {
        System.out.printf("Минимальное значение: %d%n", Collections.min(numList));
        System.out.printf("Максимальное значение: %d%n", Collections.max(numList));
        System.out.printf("Среднее арифметическое: %f%n", calculateAverage(numList));
    }

    private static double calculateAverage(List<Integer> numList) {
        Integer sum = 0;
        if (!numList.isEmpty()) {
            for (Integer num: numList) {
                sum += num;
            }
            return sum.doubleValue() / numList.size();
        }
        return sum;
    }

    private static void printStats2(List<Integer> numList) {
        IntSummaryStatistics stats = numList.stream().mapToInt(i -> i).summaryStatistics();
        System.out.printf("min: %d%n", stats.getMin());
        System.out.printf("max: %d%n", stats.getMax());
        System.out.printf("avg: %f%n", stats.getAverage());
    }
}

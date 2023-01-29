package sem_03_hw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/*  Задан целочисленный список ArrayList.
    Найти минимальное, максимальное и среднее арифметическое из этого списка.
*/
public class Ex2 {
    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            numList.add(random.nextInt(1000));
        }
        System.out.println("Список:");
        System.out.println(numList);

        System.out.printf("Минимальное значение: %d%n", Collections.min(numList));
        System.out.printf("Максимальное значение: %d%n", Collections.max(numList));
        System.out.printf("Среднее арифметическое: %f%n", calculateAverage(numList));
    }

    private static double calculateAverage(ArrayList<Integer> numList) {
        Integer sum = 0;
        if (!numList.isEmpty()) {
            for (Integer num: numList) {
                sum += num;
            }
            return sum.doubleValue() / numList.size();
        }
        return sum;
    }
}

package sem_03_hw;

import java.util.ArrayList;
import java.util.Random;

/*  Пусть дан произвольный список целых чисел, удалить из него четные числа
    (в языке уже есть что-то готовое для этого)
*/
public class Ex1 {
    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            numList.add(random.nextInt(100));
        }
        System.out.println("Исходный список:");
        System.out.println(numList);

        numList.removeIf(x -> x % 2 == 0);

        System.out.println("Список без чётных чисел:");
        System.out.println(numList);
    }
}

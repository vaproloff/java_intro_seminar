package sem_04_hw;

import java.util.LinkedList;
import java.util.List;

/*  2. Пусть дан LinkedList с несколькими элементами.
    Реализуйте метод, который вернет “перевернутый” список.
*/
public class Ex2 {
    public static void main(String[] args) {
        List<Integer> numbers = new LinkedList<>();
        for (int i = 0; i < 20; i++) {
            numbers.add(i + 1);
        }
        System.out.println("Исходный список: " + numbers);
        System.out.println("Перевёрнутый список: " + reverseNumbers(numbers));
    }

    private static List<Integer> reverseNumbers(List<Integer> numbers) {
        List<Integer> reversedNumbers = new LinkedList<>();
        while (!numbers.isEmpty()) {
            reversedNumbers.add(0, numbers.remove(0));
        }
        return reversedNumbers;
    }
}

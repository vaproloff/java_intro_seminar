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
        System.out.println("Перевёрнутый список (способ 1): " + reverseNumbers1(numbers));
        System.out.println("Перевёрнутый список (способ 2): " + reverseNumbers2(numbers));
        System.out.println("Перевёрнутый список (способ 3): " + reverseNumbers3(numbers));
    }

    private static List<Integer> reverseNumbers1(List<Integer> numbers) {
        List<Integer> reversedNumbers = new LinkedList<>();
        for (int i = numbers.size() - 1; i >= 0 ; i--) {
            reversedNumbers.add(numbers.get(i));
        }
        return reversedNumbers;
    }

    private static List<Integer> reverseNumbers2(List<Integer> numbers) {
//        Создаю копию только для задания, чтобы третий способ работал с исходным списком
        List<Integer> reversedNumbers = new LinkedList<>(numbers);
        for (int i = 0; i < reversedNumbers.size() / 2; i++) {
            int temp = reversedNumbers.get(i);
            reversedNumbers.set(i, reversedNumbers.get(reversedNumbers.size() - i - 1));
            reversedNumbers.set(reversedNumbers.size() - i - 1, temp);
        }
        return reversedNumbers;
    }

    private static List<Integer> reverseNumbers3(List<Integer> numbers) {
        List<Integer> reversedNumbers = new LinkedList<>();
        while (!numbers.isEmpty()) {
            reversedNumbers.add(0, numbers.remove(0));
        }
        return reversedNumbers;
    }
}

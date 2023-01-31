package sem_04_hw;

import java.util.LinkedList;

/*  2. Пусть дан LinkedList с несколькими элементами.
    Реализуйте метод, который вернет “перевернутый” список.
*/
public class Ex2 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 20; i++) {
            linkedList.add(i + 1);
        }
        System.out.println("Исходный список: " + linkedList);
        System.out.println("Перевёрнутый список: " + reverseList(linkedList));
    }

    private static LinkedList<Integer> reverseList(LinkedList<Integer> linkedList) {
        LinkedList<Integer> reversedList = new LinkedList<>();
        while (!linkedList.isEmpty()) {
            reversedList.add(0, linkedList.remove());
        }
        return reversedList;
    }
}

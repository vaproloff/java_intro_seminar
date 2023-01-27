package sem_03_cw;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class ex1 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> lst = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            lst.add(random.nextInt(3, 11));
        }
        System.out.println(lst.toString());
        lst.sort(Comparator.naturalOrder());
        System.out.println(lst);

//        lst.sort(Comparator.reverseOrder());
        lst.sort((o1, o2) -> o2 - o1);
        System.out.println(lst);
    }
}

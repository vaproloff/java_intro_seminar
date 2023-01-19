package sem_01_cw;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        ex1();
        ex2();
//        ex3();
    }

//    private static void ex3() {
//        int[] array = new int[25];
//        int count = 0;
//        ArrayList<Integer> list = new ArrayList<>();
//        Random rnd = new Random();
//        for (int i = 0; i < array.length; i++) {
//            array[i] = rnd.nextInt(0, 2);
//        }
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == 1) {
//                count++;
//            } else if (array[i] == 0) {
//                list.add(count);
//                count = 0;
//            }
//        }
//        System.out.println();
//        Collections.sort(list);
//        System.out.println(list.get(list.size()-1).toString());
//    }

    private static void ex1() {
        Scanner nameScanner = new Scanner(System.in);
        System.out.print("Имя: ");
        String name = nameScanner.nextLine();
        System.out.printf("Привет, %s!%n", name);
        nameScanner.close();
    }

    private static void ex2() {
        int[] arr = new int[10];
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(0, 2);
        }

        int count = 0;
        int max = 0;
        for (int i: arr) {
            if (i == 1) {
                count++;
            } else {
                max = Math.max(count, max);
                count = 0;
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Math.max(count, max));
    }
}

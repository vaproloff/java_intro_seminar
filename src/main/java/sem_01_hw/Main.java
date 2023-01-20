package sem_01_hw;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ex_1();
        ex_2();
        ex_3();
    }

    private static void ex_1() {
    /*  1. Задать одномерный массив и найти в нем минимальный и максимальный элементы
    */
        int[] arr = new int[100];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1000);
        }

        int maxNumber = Integer.MIN_VALUE;
        int minNumber = Integer.MAX_VALUE;

        for (int item: arr) {
            maxNumber = Math.max(item, maxNumber);
            minNumber = Math.min(item, minNumber);
        }

        System.out.println("Min number: " + minNumber);
        System.out.println("Max number: " + maxNumber);
    }

    private static void ex_2() {
    /*  2. Написать метод, который определяет, является ли год високосным, и возвращает boolean
        (високосный - true, не високосный - false). Каждый 4-й год является високосным,
        кроме каждого 100-го, при этом каждый 400-й – високосный.
    */
        Scanner yearScanner = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = Integer.parseInt(yearScanner.nextLine());
        System.out.println(isLeapYear(year) ? "Високосный год" : "Не високосный год");
        yearScanner.close();
    }

    private static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            }
            return true;
        }
        return false;
    }

    private static void ex_3() {
    /*  3. Дан массив nums = [3,2,2,3] и число val = 3.
        Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
        Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного,
        а остальные - равны ему.
    */
        int val = 3;
        int[] arr = new int[30];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(4);
        }
        System.out.print("Исходный массив: ");
        System.out.println(Arrays.toString(arr));

        int leftIndex = 0;
        int rightIndex = arr.length - 1;
        while (leftIndex <= rightIndex) {
            if (arr[leftIndex] == val && arr[rightIndex] != val) {
                arr[leftIndex] = arr[rightIndex];
                arr[rightIndex] = val;
                leftIndex++;
                rightIndex--;
            } else {
                if (arr[leftIndex] != val) {
                    leftIndex++;
                }
                if (arr[rightIndex] == val) {
                    rightIndex--;
                }
            }
        }

        System.out.print("Изменённый массив: ");
        System.out.println(Arrays.toString(arr));
    }
}

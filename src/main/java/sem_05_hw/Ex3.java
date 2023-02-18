package sem_05_hw;

import java.util.Arrays;
import java.util.Random;

/*
    *Реализовать алгоритм пирамидальной сортировки (HeapSort).
*/
public class Ex3 {
    public static void main(String[] args) {
        Integer[] numbers = new Integer[20];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }

        System.out.println(Arrays.toString(numbers));
        sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    private static void sort(Integer[] numbers) {
        for (int i = numbers.length / 2 - 1; i >= 0; i--) {
            updateHeap(numbers, numbers.length, i);
        }

        for (int i = numbers.length - 1; i >= 0; i--) {
            int temp = numbers[0];
            numbers[0] = numbers[i];
            numbers[i] = temp;

            updateHeap(numbers, i, 0);
        }
    }

    private static void updateHeap(Integer[] numbers, int length, int i) {
        int rootPos = i;
        int leftChild = 2 * i + 1;
        int rightChild = 2 * i + 2;

        if (leftChild < length && numbers[leftChild] > numbers[rootPos]) {
            rootPos = leftChild;
        }
        if (rightChild < length && numbers[rightChild] > numbers[rootPos]) {
            rootPos = rightChild;
        }
        if (rootPos != i) {
            int temp = numbers[i];
            numbers[i] = numbers[rootPos];
            numbers[rootPos] = temp;

            updateHeap(numbers, length, rootPos);
        }
    }
}

package com.company.Weak3Day5;

import java.util.Random;
import java.util.Scanner;

public class BubbleSortRecrsion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input N size");
        int N = scanner.nextInt();
        Random random = new Random();
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = random.nextInt(99) + 1;
        }
        int i = 0;
        int count = 0;
        sortBubbleRec(array, i, count);
        printSort(array, i);
    }

    public static int[] sortBubbleRec(int[] array, int i, int count) {
        int temp = 0;
        if (array[i] > array[i + 1]) {
            temp = array[i + 1];
            array[i + 1] = array[i];
            array[i] = temp;
        }
        if (count > Math.pow(array.length, 2)) {
            return array;
        }
        if (i == array.length - 2) {
            return sortBubbleRec(array, 0, ++count);
        }
        return sortBubbleRec(array, i + 1, ++count);
    }

    public static void printSort(int[] array, int i) {
        if (i < array.length) {
            System.out.print(array[i] + " ");
           printSort(array, i + 1);
        }
    }
}


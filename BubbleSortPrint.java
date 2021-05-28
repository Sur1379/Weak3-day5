package com.company.Weak3Day5;

import java.util.Random;
import java.util.Scanner;

public class BubbleSortPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input N size");
        int N = scanner.nextInt();
        Random random = new Random();
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = random.nextInt(99) + 1;
        }
        sortBubble(array);
    }

    public static void sortBubble(int[] array) {
        int count;
        do {
            count = 0;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                    count++;
                }
            }
        } while (count > 0);


        printArray(array);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

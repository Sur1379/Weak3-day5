package com.company.Weak3Day5;

import java.util.Scanner;

public class StringSortRecursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input N size");
        int N = scanner.nextInt();
        String[] array = new String[N];
        for (int i = 0; i < N; i++) {
            System.out.println("Input text");
            array[i] = scanner.next();
        }
        int i = 0;
        int count = 0;
        sortStringRec(array, i, count);
        printSortRec(array, i);
    }
    public static String[] sortStringRec(String[] array, int i, int count) {
        String temp = "";
        if (array[i].compareTo(array[i + 1]) > 0) {
            temp = array[i + 1];
            array[i + 1] = array[i];
            array[i] = temp;
        }
        if (count == Math.pow(array.length, 2)) {
            return array;
        }
        if (i == array.length - 2) {
            return sortStringRec(array, 0, count);
        }
        return sortStringRec(array, i + 1, ++count);
    }

    public static void printSortRec(String[] array, int i) {
        if (i < array.length) {
            System.out.print(array[i] + " ");
            printSortRec(array, i + 1);
        }
    }

}

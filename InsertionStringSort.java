package com.company.Weak3Day5;

import java.util.Arrays;
import java.util.Scanner;

import static com.company.Weak3Day5.SelectionStringMax.printMaxString;

public class InsertionStringSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input N size");
        int N = scanner.nextInt();
        String[] array = new String[N];
        for (int i = 0; i < N; i++) {
            System.out.println("Input text");
            array[i] = scanner.next();
        }
        System.out.println(Arrays.toString(sortStringInsert(array)));
    }

    public static String[] sortStringInsert(String[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            String min = array[i];
            while (i > 0 && array[i - 1].compareTo(array[i]) > 0) {
                array[i] = array[i - 1];
                array[i - 1] = min;
                i--;
            }
        }
        return array;
    }

}

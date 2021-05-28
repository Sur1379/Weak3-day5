package com.company.Weak3Day5;

import java.util.Arrays;
import java.util.Scanner;

public class StringBubble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input N size");
        int N = scanner.nextInt();
        String[] array = new String[N];
        for (int i = 0; i < N; i++) {
            System.out.println("Input text");
            array[i] = scanner.next();
        }
        sortString(array);
        printSort(array);
    }

    public static String[] sortString(String[] array) {
        int count;
        do {
            count = 0;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i].compareTo(array[i + 1]) > 0) {
                    String temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                    count++;
                }
            }
        }
        while (count > 0);
        return array;
    }
    public static void printSort(String[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ " ");
        }
    }
}
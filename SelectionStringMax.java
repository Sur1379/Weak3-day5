package com.company.Weak3Day5;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionStringMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input N size");
        int N = scanner.nextInt();
        String[] array = new String[N];
        for (int i = 0; i < N; i++) {
            System.out.println("Input text");
            array[i] = scanner.next();
        }
        System.out.println(Arrays.toString(sortStringSelect(array)));
        printMaxString(array);

    }
    public static String[] sortStringSelect(String[] array){
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if(array[minIndex].compareTo(array[j]) > 0){
                    minIndex = j;
                }
            }
            String min = array[minIndex];
            array[minIndex] = array[i];
            array[i] = min;
        }
        return array;
    }
    public static void printMaxString(String[] array){
        System.out.println("Max - "+ array[array.length - 1] + " Min - " + array[0]);
    }
}

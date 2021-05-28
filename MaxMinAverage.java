package com.company.Weak3Day5;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMinAverage {
    public static void main(String[] args) {
        int[] array = {4, 7, 9, 4, 3, 2, 8, 6, 1};
        System.out.println(Arrays.toString(sortIntArray(array)));
        printMaxMin(array);

    }

    public static int[] sortIntArray(int[] array) {
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
        }
        while (count > 0);
    return array;
    }
    public static void printMaxMin(int[] array){
        System.out.println("Max - " + array[array.length-1] + "  Min - " + array[0]);
        int avg = (array[array.length-1] + array[0])/2;
        for (int i = 0; i < array.length; i++) {
            if(avg == array[i]){
                System.out.println("Average - " + avg);
                break;
            }
            else if(i == array.length - 1) {
                System.out.println("Average -  -1 ");
            }
        }

    }

}

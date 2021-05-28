package com.company.Weak3Day5;

import java.util.Arrays;

public class SelectionMaxMinAvg {
    public static void main(String[] args) {
        int[] array = {4,7,9,6,5,1,8,2,3};
        System.out.println(Arrays.toString(sortSelect(array)));
        printMaxAndMin(array);
    }
    public static int[] sortSelect(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if(array[minIndex] > array[j]){
                    minIndex = j;
                }
            }
            int min = array[minIndex];
            array[minIndex] = array[i];
            array[i] = min;
        }
        return array;
    }
    public static void printMaxAndMin(int[] array){
        System.out.println("Max - " + array[array.length-1] + " Min - " + array[0]);
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        int average = sum/ array.length;
        System.out.println("Average - " + average);
    }
}
//for (int i = 0; i < array.length - 1; i++) {
//        for (int j = i + 1; j < array.length; j++) {
//        int min = i;
//        if(array[i] > array[j]){
//        array[i] = array[j];
//        array[j] = min;
//        }
//        }
//        }
//        return array;
//        }
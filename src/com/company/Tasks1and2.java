package com.company;

import java.util.Random;
import java.util.Scanner;

public class Tasks1and2 {

    public static void main(String[] args) {
        // Найти максимальный элемент массива
        int n = 30;
        int[] arr2 = inputArrayWithRandom(n, 0, 100);
        int maxNumber = arr2[0];
        printArray(arr2, n);
        for (int i = 0; i<n; i++){
            if (arr2 [i] > maxNumber){
                maxNumber = arr2 [i];
            }
        }
        System.out.println("The maximum number in the array is: " + maxNumber);


        //Найти минимальный элемент массива
//        int n = 10;
//        int [] arr3 = inputArrayWithRandom(n, 12,70);
//        int minNumber = arr3[0];
//        printArray(arr3, n);
//        for (int i = 0; i<n; i++){
//            if (arr3 [i] < minNumber){
//                minNumber = arr3 [i];
//            }
//        }
//        System.out.println("The minimum number in the array is: " + minNumber);
//


    }


    public static void printArray(int[] array, int length) {
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }


    public static int[] inputArrayWithRandom(int n, int origin, int bound) {
        Random random = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(origin, bound);
        }
        return arr;
    }


}



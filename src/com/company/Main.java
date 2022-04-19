package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Посчитать количество нечетных элементов массива (7)
        int n = 20;
        int[] arr1 = inputArrayWithRandom(n, 1, 20);
        printArray(arr1, n);

        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (arr1[i] % 2 != 0) {
                sum += arr1[i];
            }
        }
        System.out.println(sum);
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

    public static int square (int number){
        int l = (int) Math.pow(number, 2);
        return  l;
    }
}


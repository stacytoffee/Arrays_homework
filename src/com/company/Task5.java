package com.company;

import java.util.Random;

public class Task5 {
    public static void main (String []args){
       //Посчитать сумму элементов массива с нечетными индексами
        int n = 17;
        int []arr5 = inputArrayWithRandom(n, 0,80);
        printArray(arr5,n);
        int sum = 0;

        for (int i = 1; i < n; i+=2){
            sum += arr5[i];
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


}

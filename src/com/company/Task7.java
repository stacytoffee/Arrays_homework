package com.company;

import java.util.Random;

public class Task7 {
    public static void main(String[] args) {
        //Посчитать количество нечетных элементов массива
        int n = 22;
        int [] arr7 = inputArrayWithRandom(n, 1, 100);
        printArray(arr7,n);
        int count = 0;

        for (int i = 0; i < n; i++){
            if (arr7[i]%2 == 0){
             count++;
            }
        }
        System.out.println(count);






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

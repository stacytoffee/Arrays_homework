package com.company;

import java.util.Random;

public class Task8 {
    public static void main(String[] args) {
        //Поменять местами первую и вторую половину массива, например, для массива 1 2 3 4, результат 3 4 1 2,  или для 12345 - 45312.
        int n = 10;
        int[] arr8 = inputArrayWithRandom(n, 0, 50);
        printArray(arr8, n);

        for (int j = n / 2; j < 3 * n / 4; j++) {
            int temp = arr8[j];
            arr8[j] = arr8[n - j - 1];
            arr8[n - j - 1] = temp;


        }


        for (int i = 0; i < n / 4; i++) {
            int temp = arr8[i];
            arr8[i] = arr8[n / 2 - i - 1];
            arr8[n / 2 - i - 1] = temp;

        }
        printArray(arr8, n);


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

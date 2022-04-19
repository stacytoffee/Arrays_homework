package com.company;

import java.util.Random;

public class Task9 {
    public static void main(String[] args) {
        //Отсортировать массив по возрастанию пузырьком(Bubble)
        int n = 22;
        int[] array9 = inputArrayWithRandom(n, 0, 100);
        printArray(array9, n);
        boolean flag;
        for (int k = 0; k < n - 1; k++) {
            flag = false;
            for (int i = 0; i < n - 1; i++) {
                if (array9[i] > array9[i + 1]) {
                    flag = true;
                    int temp = array9[i];
                    array9[i] = array9[i + 1];
                    array9[i + 1] = temp;
                }
            }
            if (!flag) break;
        }
        printArray(array9, n);


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

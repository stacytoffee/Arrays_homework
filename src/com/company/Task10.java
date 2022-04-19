package com.company;

import java.util.Random;

public class Task10 {
    public static void main (String []ags){
        int n = 10;
        int [] array10 = inputArrayWithRandom(n,0,143);
        printArray(array10, n);
        InsertionSort(array10);
        printArray(array10, n);

    }


    public static void InsertionSort (int[]array){
        for  (int i = 1; i< array.length; i++){ //цикл для элементов неотсортированной последовательности
            int current = array [i];//переменная для текущего элемента
            int j = i;
            //а теперь соддаем внутренний цикл для отсортированной последовательности и одновременно сдвигаем элементы
            while (j > 0 && array[j - 1] > current ){
                array [j] = array[j-1];
                j--;
            }
            array [j] = current;
        }

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

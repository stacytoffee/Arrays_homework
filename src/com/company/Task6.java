package com.company;

import java.util.Random;

public class Task6 {
    public static void main (String []args){
        //Сделать реверс массива (массив в обратном направлении)
        int n = 10;
        int [] arr6 = inputArrayWithRandom(n,0,100);
        printArray(arr6,n);
        for (int i = 0; i < n/2; i++){
            int temp = arr6 [i];
            arr6 [i] = arr6 [n-i-1];
            arr6 [n-i-1] = temp;

        } printArray(arr6,n);
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

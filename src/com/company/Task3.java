package com.company;

import java.util.Random;

public class Task3 {
    public static void main (String [] args){
        //Найти индекс минимального элемента массива
        int n = 15;
        int Maxnumber = 0;
        int index = 0;
        int [] arr3 = inputArrayWithRandom(n, 55, 140);
        printArray(arr3, n);

        for (int i = 0; i<n;i++){
            if (arr3 [i] > Maxnumber){
                Maxnumber = arr3 [i];
                index = i;
            }
        }
        System.out.println("The maximum number in the array is: " + Maxnumber);
        System.out.println("The index of the array with the maximum value is " +  index);


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

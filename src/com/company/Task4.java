package com.company;

import java.util.Random;

public class Task4 {
    public static void main (String [] args){
        //Найти индекс максимального элемента массива
        int n = 12;
        int Minnumber = 60;
        int index = 0;
        int [] arr4 = inputArrayWithRandom(n,40, 60);
        printArray(arr4, n);

        for (int i = 0; i < n; i++){
            if (arr4 [i] < Minnumber){
                Minnumber = arr4 [i];
                index = i;
            }
        }
        System.out.println("The minimum number in the array is: " + Minnumber);
        System.out.println("The index of the array with the minimum value is " +  index);








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

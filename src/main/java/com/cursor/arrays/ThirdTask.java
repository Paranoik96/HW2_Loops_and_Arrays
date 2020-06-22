package com.cursor.arrays;

public class ThirdTask {

    static void amendDuplicateArrVal(int[] array) {
        System.out.println("The Array is : ");
        for (int key : array) {
            System.out.print(key + " ");
        }
        System.out.println("\nAmend Duplicate numbers to zero: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    array[j] = 0;
                }
            }
            System.out.print(array[i] + " ");
        }
    }
}

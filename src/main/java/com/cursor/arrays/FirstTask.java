package com.cursor.arrays;

import java.util.Arrays;

public class FirstTask {
    static void randNumbArr(int[] array) {
        System.out.print("Array values are : ");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    static void minValArray(int[] array) {
        int minValue = array[0];
        for (int value : array) {
            if (minValue > value) {
                minValue = value;
            }
        }
        System.out.println("Min value is : " + minValue);
    }

    static void maxValArray(int[] array) {

        int maxValue = array[0];
        for (int value : array) {
            if (maxValue < value) {
                maxValue = value;
            }
        }
        System.out.println("Max value is : " + maxValue);
    }

    static void sortArrByAscending(int[] array) {
        Arrays.sort(array);
        System.out.print("Sorted by Ascending : ");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    static void sortArrByDescending(int[] array) {
        System.out.print("Sorted by Descending : ");
        for (int j = 0; j < array.length; j++) {
            for (int k = j + 1; k < array.length; k++) {
                if (array[j] < array[k]) {
                    int temp = array[k];
                    array[k] = array[j];
                    array[j] = temp;
                }
            }
            System.out.print(array[j] + " ");
        }
        System.out.println();
    }

    static void arraySum(int[] array) {

        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        System.out.println("Summary amount of all values in array : " + sum);
    }

    static void squareArrVal(int[] array) {
        System.out.println("Squared each array value: ");
        for (int squaredValue : array) {
            squaredValue = squaredValue * squaredValue;
            System.out.print(squaredValue + " ");
        }
        System.out.println();
    }
}

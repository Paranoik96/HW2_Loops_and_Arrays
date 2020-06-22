package com.cursor.arrays;

public class SecondTask {

    static void stringDiagonal(String[][] str) {
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i][i] + " ");
        }
        System.out.println();
    }
}

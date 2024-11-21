package exo30;

import java.util.Scanner;

public class exo30 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5, 6, 7, 8, 9, 10};
        int temp = 4;
        int[] ok = new int[array.length + 1];

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " | ");
        }
        System.out.println();
        boolean fin = true;
        int i = 0;

        for (i = 0; i < array.length && fin; i++) {
            ok[i] = array[i];
            if (temp > array[i] && temp < array[i + 1]) {
                fin = false;
            }
        }
        ok[i] = temp;
        int j = i;
        for ( i = j ; i < array.length ; i++) {
            ok[i+1] = array[i] ;
        }
        for (i = 0; i < ok.length; i++) {
            System.out.print(ok[i] + " | ");
        }

    }
}

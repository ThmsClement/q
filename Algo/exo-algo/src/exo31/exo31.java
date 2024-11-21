package exo31;

import java.util.Scanner;

public class exo31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] ok = new int[array.length];
        boolean fin = true;

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " , ");
        }
        System.out.println("");

        System.out.println("entrer un entier entre 1 et 10");
        int choice = sc.nextInt();
        int i = 0;

        for (i = 0; i < array.length && fin; i++) {
            if (choice == array[i]) {
                ok[i] = array[i + 1];
                fin = false;
            } else {
                ok[i] = array[i];
            }
        }
        int j = i;

        for ( i = j ; i < ok.length-1 ; i++) {
            ok[i] = array[i + 1];
        }
        for (i = 0; i < ok.length; i++) {
            System.out.print(ok[i] + " , ");
        }
    }
}

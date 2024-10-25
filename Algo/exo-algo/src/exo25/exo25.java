package exo25;

import java.util.Scanner;

public class exo25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arraySize = 3;
        int b = arraySize;
        int i = 0;
        int[] array = new int[arraySize];

        for (int y = 0; y < arraySize; y++) {
            System.out.println("entrer un entier");
            array[y] = Integer.parseInt(sc.nextLine());
        }
        while (i < (array.length / 2)) {
            int transitoire = array[i];
            array[i] = array[b - 1];
            array[b - 1] = transitoire;
            b--;
            i++;
        }
        for (int value : array) {
            System.out.println(value);
        }
    }
}

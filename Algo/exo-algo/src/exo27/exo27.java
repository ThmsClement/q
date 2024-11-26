package exo27;

import java.util.Scanner;

public class exo27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arraySize = 5;
        int[] array = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            System.out.println("Veuillez entrer un entier");
            array[i] = Integer.parseInt(sc.nextLine());
        }
        for (int i = 0; i < arraySize; i++) {
            for (int y = i + 1; y < arraySize; y++) {
                if (array[i] > array[y]) {
                    int temp = array[i];
                    array[i] = array[y];
                    array[y] = temp;
                }
            }
        }
        System.out.println("voici le plus petit entier rentré :" + array[0]);
    }
}

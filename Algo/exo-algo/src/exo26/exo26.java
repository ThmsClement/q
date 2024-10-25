package exo26;

import java.util.Scanner;
import java.util.Arrays;

public class exo26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arraySize = 5;
        int[] array = new int[arraySize];

        for (int y = 0 ; y < arraySize; y++){
            System.out.println("Entrer un entier");
            array[y] = Integer.parseInt(sc.nextLine());
        }
        Arrays.sort(array);

        for (int value : array){
            System.out.print(value + ",");
        }

    }
}

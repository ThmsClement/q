package exo34;

import java.util.Scanner;

public class exo34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {1, 2, 3, 4, 5};

        System.out.println("veuillez entrer un chiffre entre 1 et 5");
        int number = Integer.parseInt(sc.nextLine());
        int indice = checkArray(array, number);
        System.out.println("l'indice du chiffre entrer est :" + indice);
    }
// Je n'arrive pas à entrer la taille du tableau en parametre de ma fonction T_T

    public static int checkArray(int[] array, int number) {
        int indice = 0;
        for (int i = 0; i < array.length; i++) {
            if (number < 1 || number > array.length) {
                return -1;
            } else if (array[i] == number) {
                indice = i;
            }
        }
        return indice;
    }
}


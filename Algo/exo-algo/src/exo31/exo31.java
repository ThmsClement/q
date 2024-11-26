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



//
//        Scanner sc = new Scanner(System.in);
//        //DECLARER TABLEAU ET VALEURS
//        int[] tableauA = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        boolean trouve = false;
//
//        // PRINT TABLEAU
//        for (int i = 0; i < tableauA.length; i++) {
//            System.out.print(tableauA[i] + " | ");
//        }
//
//        System.out.println("\nEntrez une valeur à chercher dans le tableau :");
//        String insertValueToSearch = sc.nextLine();
//        while (!estEntier(insertValueToSearch)) {
//            System.out.println("Veuillez entrer un nombre entier :");
//            insertValueToSearch = sc.nextLine();
//        }
//
//        int numericalValueToSearch = Integer.parseInt(insertValueToSearch);
//        int i;
//
//        //CHERCHE LA VALEUR
//        for (i = 0; i < tableauA.length && trouve == false; i++) {
//            if (numericalValueToSearch == tableauA[i]) {
//                i--;
//                trouve = true;
//            }
//        }
//        int j = i, temp = i;
//
//        //SUPRIME LA VALEUR
//        if (trouve == true) {
//            for (i = j; i < tableauA.length; i++) {
//                temp = j;
//                if (i != tableauA.length) {
//                    tableauA[i - 1] = tableauA[i];
//                    tableauA[i] = 0;
//                } else if (i == j) {
//                    trouve = true;
//                } else {
//                    tableauA[j - 1] = temp;
//                }
//            }
//            tableauA[j - 1] = temp;
//            for (i = 0; i < tableauA.length; i++) {
//                System.out.print(tableauA[i] + " | ");
//            }
//        }
//
//        if (trouve == false) {
//            System.out.println(-1);
//        }
//    }
//
//    public static boolean estEntier(String stValue) {
//        try {
//            Integer.parseInt(stValue);
//        } catch (NumberFormatException e) {
//            return false;
//        }
//        return true;
    }
}

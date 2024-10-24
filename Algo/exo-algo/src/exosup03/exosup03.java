package exosup03;

import java.util.Scanner;

public class exosup03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tableau = new int[10];
        int i = 0;
        int resultat = 0;
        String chaine = "a";


        while (i < 10) {
            System.out.println("Merci d'entrer un Entier");
            String entier = sc.nextLine();
            if (entier.isEmpty()) {
            } else {
                try {
                    tableau[i] = Integer.parseInt(entier);
                    i++;
                } catch (NumberFormatException e) {
                }
            }

        }
        i = 0;
        if (tableau[i] < tableau[i + 1]) {
            resultat = tableau[i];
        } else {
            resultat = tableau[i + 1];
        }
        i++;
        while (i < 9) {
            if (resultat > tableau[i + 1]) {
                resultat = tableau[i + 1];
            }
            i++;
        }
        System.out.println("Voici le plus petit entier entré par vos soins : " + resultat);
    }


    public static boolean estEntier(String chaine) {
        try {
            Integer.parseInt(chaine);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}


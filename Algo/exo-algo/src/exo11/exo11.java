package exo11;

import java.util.Scanner;

public class exo11 {
    public static void main(String[] args) {
        System.out.println("Veuillez écrire la note obtenue");
        Scanner sc = new Scanner(System.in);
        String note = sc.nextLine();
        note = note.replace(',', '.');
        boolean isNumberValid = true;

        double valeur = 0;

        if (note.isEmpty()) {
            System.out.println("Vous n'avez rien écrit");
            isNumberValid = false;
        } else {
            try {
                valeur = Double.parseDouble(note);
            } catch (NumberFormatException e) {
                System.out.println("L'erreur est : " + e.getMessage());
                isNumberValid = false;
            }
        }
//        if (isNumberValid) {
//            if (valeur >= 0 && valeur <= 10) {
//                System.out.println("Votre appréciation est : Insuffisant");
//            } else if (valeur > 10 && valeur <= 12) {
//                System.out.println("Votre appréciation est : Suffisant");
//            } else if (valeur > 12 && valeur <= 15) {
//                System.out.println("Votre appréciation est : Bien");
//            } else if (valeur > 15 && valeur <= 18) {
//                System.out.println("Votre appréciation est : Très Bien!");
//            } else if (valeur > 18 && valeur <= 20) {
//                System.out.println("Votre appréciation est : Excellent!!!");
//            } else {
//                System.out.println("La valeur ne peut pas être traiter car elle n'est pas comprise entre 0 et 20");
//            }
//        }
        if (isNumberValid) {
            if (valeur >= 0 && valeur <= 10) {
                System.out.println("Votre appréciation est : Insuffisant");
            } else if (valeur <= 12) {
                System.out.println("Votre appréciation est : Suffisant");
            } else if (valeur <= 15) {
                System.out.println("Votre appréciation est : Bien");
            } else if (valeur <= 18) {
                System.out.println("Votre appréciation est : Très Bien!");
            } else if (valeur <= 20) {
                System.out.println("Votre appréciation est : Excellent!!!");
            } else {
                System.out.println("La valeur ne peut pas être traiter car elle n'est pas comprise entre 0 et 20");
            }
        }
    }
}

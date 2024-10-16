package exosup02;

import java.util.Scanner;

public class exosup02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Veuillez entrer un nombre de lignes à afficher");
//        int choix = Integer.parseInt(sc.nextLine());
//        int star = 1;
//        boolean fin = false;
//        String etoile = "*";
//
//        while (!fin) {
//            System.out.println(etoile);
//            etoile = etoile + "*";
//
//            if (choix == star) {
//                fin = true;
//            }
//            star++;
//        }

        String stNiveau = sc.nextLine();
        System.out.println("is string an integer? ");
        boolean res = estEntier(stNiveau);
        System.out.println(res);
        System.out.println("Niveau est entier ? " + estEntier("niveau"));
        System.out.println("22 est entier ? " + estEntier("22"));
        System.out.println("22.5 est entier ? " + estEntier("22.5"));


    }

    private static boolean estEntier(String niveau) {
        try {
            Integer.parseInt(niveau);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    };
}

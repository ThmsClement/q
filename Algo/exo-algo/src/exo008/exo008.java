package exo008;

import java.util.Scanner;

public class exo008 {
    public static void main(String[] args) {

//        System.out.println("Etês vous prêt à recevoir la balle :");
//        Scanner sc = new Scanner(System.in);
//        boolean ok = Boolean.parseBoolean(sc.nextLine());
//
//        System.out.println("Le panier est il vide? :");
//        boolean panierVide = Boolean.parseBoolean(sc.nextLine());
//
//
//        if (ok & !panierVide) {
//            System.out.println("Je lance la balle");
//        }
//        else {
//            System.out.println("Je ne lance pas la balle car");
//            if (panierVide) {
//                System.out.println("Le panier est vide");
//            }
//            if (!ok) {
//                System.out.println("Vous n'êtes pas prêt");
//            }
//        }


        System.out.println("Etês vous prêt à recevoir la balle :");
        Scanner sc = new Scanner(System.in);
        boolean ok = Boolean.parseBoolean(sc.nextLine());

        if (ok) {
            System.out.println("Le panier est il vide? :");
            boolean panierVide = Boolean.parseBoolean(sc.nextLine());
            if (!panierVide) {
                System.out.println("Je lance la balle");
            } else {
                System.out.println("Je ne lance pas la balle car le panier est vide");
            }
        } else {
            System.out.println("Je ne lance pas la balle car");
            System.out.println("Vous n'êtes pas prêt");
        }
    }
}
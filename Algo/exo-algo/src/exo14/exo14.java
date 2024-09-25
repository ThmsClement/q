package exo14;

import java.util.Scanner;

public class exo14 {
    public static void main(String[] args) {
        System.out.println("Combien y a-t-il de balles dans le panier ?");
        Scanner sc = new Scanner(System.in);
        int panier = Integer.parseInt(sc.nextLine());
        boolean ok = false;


        while (panier > 0) {
            System.out.println("Êtes vous prêt à recevoir la balle :");
            ok = Boolean.parseBoolean(sc.nextLine());
            if (ok) {
                System.out.println("Je lance la balle");
                panier = panier - 1;
            } else {
                System.out.println("Vous n'êtes plus prêt.");
            }
        }

//        if (ok && panier > 0) {
//            while (ok && panier > 0) {
//                System.out.println("Je lance la balle");
//                panier = panier - 1;
//                System.out.println("Êtes vous toujours prêt à recevoir la balle :");
//                ok = Boolean.parseBoolean(sc.nextLine());
//            }
//        } else {
//            System.out.println("Vous n'êtes pas prêt, bonne journée.");
//        }

        System.out.println("Il n'y a plus de balles dans le panier, bonne journée.");


    }
}

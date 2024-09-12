package exo008;

import java.util.Scanner;

public class exo008 {
    public static void main(String[] args) {
        int balles = 1;
        System.out.println("Etês vous prêt à recevoir la balle :");
        Scanner sc = new Scanner(System.in);
        boolean ok = Boolean.parseBoolean(sc.nextLine());
        if (ok == true & balles >= 0) {
            if ( ok == true & balles == 0){
                System.out.println("panier vide");
            }
            else {
                System.out.println("Lancer balle");
            }
        }
        else {
            System.out.println("Lanceur pas prêt");
        }
        int balle = balles - 1;
        balles  = balle;
    }
}
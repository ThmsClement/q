package exosup02;

import java.util.Scanner;

public class exosup02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez entrer un nombre de lignes à afficher");
        int choix = Integer.parseInt(sc.nextLine());
        int star = 1;
        boolean fin = false;
        String etoile = "*";

        while (!fin) {
            System.out.println(etoile);
            etoile = etoile + "*";

            if (choix == star) {
                fin = true;
            }
            star++;
        }
    }
}

package exo17;

import java.util.Random;
import java.util.Scanner;

public class exo17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean autreBoisson = true;
        int coca = 2;
        int eau = 1;

        do {
            System.out.println("Que voulez vous boire ? Taper 1 pour un Coca, Taper 2 pour de l'eau");
            int choix = Integer.parseInt(sc.nextLine());
            switch (choix) {
                case 1:
                    if (coca > 0) {
                        System.out.println("Voici votre coca");
                        coca--;
                    } else {
                        System.out.println("Il n'y a plus de coca dans la machine");
                    }
                    break;
                case 2:
                    if (eau > 0) {
                        System.out.println("Voici votre eau");
                        eau--;
                    } else {
                        System.out.println("Il n'y a plus d'eau dans la machine");
                    }
                    break;
                default:
                    System.out.println("Le choix n'est pas valide");
            }
            System.out.println("Il reste dans la machine : ");
            System.out.println(coca + " coca");
            System.out.println(eau + " eau");
            System.out.println("Avez vous toujours soif ? ");
            autreBoisson = Boolean.parseBoolean(sc.nextLine());

            if (coca == 0 && eau == 0) {
                System.out.println("Il n'y a plus de boisson dans la machine");
            }

        } while (autreBoisson == true && (eau > 0 || coca > 0));
        System.out.println("Merci, bonne journée");
    }
}


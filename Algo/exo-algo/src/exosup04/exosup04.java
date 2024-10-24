package exosup04;

import java.util.Scanner;

public class exosup04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tiret = "-";
        String star = "*";
        int nbTiret = 1;
        int nbStar = 1;
        int nbRep = 0;
        int nbFin = 0;
        boolean choixTiret = true;
        boolean choixStar = true;
        boolean choixRep = true;

        System.out.println("Veuiller entrer un nombre de Tirets");

        while (choixTiret) {
            String choix = sc.nextLine();
            if (choix.isEmpty()) {
                System.out.println("Veuiller entrer un nombre de Tirets");
            } else {
                try {
                    nbTiret = Integer.parseInt(choix);
                    choixTiret = false;
                } catch (NumberFormatException e) {
                    System.out.println("Veuiller entrer un nombre de Tirets");

                }
            }
        }

        System.out.println("Veuiller entrer un nombre d'étoiles");
        while (choixStar) {
            String choix = sc.nextLine();
            if (choix.isEmpty()) {
                System.out.println("Veuiller entrer un nombre de Tirets");
            } else {
                try {
                    nbStar = Integer.parseInt(choix);
                    choixStar = false;
                } catch (NumberFormatException e) {
                    System.out.println("Veuiller entrer un nombre de Tirets");

                }
            }
        }

        System.out.println("Veuiller entrer un nombre de répétitions");
        while (choixRep) {
            String choix = sc.nextLine();
            if (choix.isEmpty()) {
                System.out.println("Veuiller entrer un nombre de Tirets");
            } else {
                try {
                    nbRep = Integer.parseInt(choix);
                    choixRep = false;
                } catch (NumberFormatException e) {
                    System.out.println("Veuiller entrer un nombre de Tirets");

                }
            }
        }
        choixTiret = true;
        choixStar = true;
        boolean fin = true;
        int incrementation = 1;

        while (fin) {
            while (choixTiret) {
                System.out.print(tiret);
                if (nbTiret == incrementation) {
                    choixTiret = false;
                }
                incrementation++;
            }
            choixTiret = true;
            incrementation = 1;

            while (choixStar) {
                System.out.print(star);

                if (nbStar == incrementation) {
                    choixStar = false;
                }
                incrementation++;
            }
            choixStar = true;
            incrementation = 1;

            nbFin++;
            if (nbFin == nbRep){
                fin = false;
            }

        }

    }
}

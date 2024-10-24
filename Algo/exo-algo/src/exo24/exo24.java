package exo24;

import java.util.Scanner;

public class exo24 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Combien de joueurs? (max 10)");
        int nbJoueurs = sc.nextInt();
        while (nbJoueurs > 10) {
            System.out.println("Trop de joueurs");
            System.out.println("Combien de joueurs? (max 10)");
            nbJoueurs = sc.nextInt();
        }
        int[] scores = new int[nbJoueurs];
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Entrer le score du joueur " + (i + 1));
            scores[i] = sc.nextInt();
        }
        double moyenne = 0;
        for (int note : scores) {
            moyenne = moyenne + note;
        }
        moyenne = moyenne / nbJoueurs;
        System.out.println("La moyenne est de : " + moyenne);
    }
}

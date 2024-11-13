package exo29;

import java.util.Scanner;

public class exo29 {
    public static void main(String[] args) {
        boolean done = false;
        boolean fin = false;
        int i = 0;
        Scanner sc = new Scanner(System.in);
        String[] pionArray = {"PION", "---", "---", "---", "---", "---", "---", "---", "---", "---"};
        for (String pion : pionArray) {
            System.out.print(pion + "|");
        }
        do {
            System.out.println(" ");
            System.out.println("pour déplacer le PION vers la gauche : g");
            System.out.println("pour déplacer le PION vers la droite : d");
            System.out.println("pour quitter le jeu : q");
            String choice = sc.nextLine();

            while (!done && !fin) {
                if (choice.equals("d")) {
                    if (pionArray[9].equals("PION")) {
                        System.out.println("Vous êtes sur le bord du tableau, le PION ne peut pas être déplacé");
                        done = true;
                    } else if (pionArray[i].equals("PION")) {
                        pionArray[i + 1] = pionArray[i];
                        pionArray[i] = "---";
                        done = true;
                    }
                }
                if (choice.equals("g")) {
                    if (pionArray[0].equals("PION")) {
                        System.out.println("Vous êtes sur le bord du tableau, le PION ne peut pas être déplacé");
                        done = true;
                    } else if (pionArray[i].equals("PION")) {
                        pionArray[i - 1] = pionArray[i];
                        pionArray[i] = "---";
                        done = true;
                    }
                }
                if (choice.equals("q")) {
                    fin = true;
                }
                i++;
            }
            for (String ligne : pionArray) {
                System.out.print(ligne + "|");
            }
            done = false;
            i = 0;
        } while (!fin);

        System.out.println(" ");
        System.out.println("fin de partie");
    }
}
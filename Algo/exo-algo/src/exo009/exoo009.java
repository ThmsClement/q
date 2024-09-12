package exo009;

import java.util.Scanner;

public class exoo009 {
    public static void main(String[] args) {
        int coca = 0;
        int eau = 0;
        int fanta = 0;
        System.out.println("Merci de taper le chiffre correspondant à la boisson désirée :");
        System.out.println("1 = coca\n2 = eau\n3 = fanta");
        Scanner sc = new Scanner(System.in);
        int choix = Integer.parseInt(sc.nextLine());
        switch (choix) {
            case 1:
                if (coca > 0) {
                    System.out.println("Profitez de votre coca biens frais");
                }
                else {
                    System.out.println("Il n'y a plus de coca dans la machine");
                }
                break;
                case 2:
                    if (eau > 0) {
                        System.out.println("L'eau c'est bon pour la santé!");
                    }
                    else {
                        System.out.println("Il n'y a plus d'eau dans la machine");
                    }
                    break;
                    case 3:
                        if (fanta > 0) {
                            System.out.println("Fantaaaaaa!");
                        }
                        else {
                            System.out.println("Il n'y a plus de fanta dans la machine");
                            break;
                        }
        }
    }
}

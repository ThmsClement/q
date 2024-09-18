package exo12;

import java.util.Scanner;

public class exo12 {
    public static void main(String[] args) {
        System.out.println("Veuillez écrire un nombre de jours");
        Scanner sc = new Scanner(System.in);
        String valeur1 = sc.nextLine();
        valeur1 = valeur1.replace(',', '.');
        boolean isNumberValid = true;

        double jours1 = 0;

        if (valeur1.length() == 0) {
            System.out.println("Vous n'avez rien écrit");
            isNumberValid = false;
        } else {
            try {
                jours1 = Double.parseDouble(valeur1);
                jours1 = jours1 * 86400;
            } catch (NumberFormatException e) {
                System.out.println("L'erreur est : " + e.getMessage());
                isNumberValid = false;
            }
        }

        System.out.println("Veuillez écrire un nombre d'heures");
        String valeur2 = sc.nextLine();
        valeur2 = valeur2.replace(',', '.');

        double heures1 = 0;

        if (valeur2.length() == 0) {
            System.out.println("Vous n'avez rien écrit");
            isNumberValid = false;
        } else {
            try {
                heures1 = Double.parseDouble(valeur2);
                heures1 = heures1 * 3600;
            } catch (NumberFormatException e) {
                System.out.println("L'erreur est : " + e.getMessage());
                isNumberValid = false;
            }
        }
        System.out.println("Veuillez écrire un nombre de minutes");
        String valeur3 = sc.nextLine();
        valeur3 = valeur3.replace(',', '.');

        double minutes1 = 0;

        if (valeur3.length() == 0) {
            System.out.println("Vous n'avez rien écrit");
            isNumberValid = false;
        } else {
            try {
                minutes1 = Double.parseDouble(valeur3);
                minutes1 = minutes1 * 60;
            } catch (NumberFormatException e) {
                System.out.println("L'erreur est : " + e.getMessage());
                isNumberValid = false;
            }
        }

        System.out.println("Veuillez écrire un nombre de secondes");
        String valeur4 = sc.nextLine();
        valeur4 = valeur4.replace(',', '.');

        double secondes1 = 0;

        if (valeur4.length() == 0) {
            System.out.println("Vous n'avez rien écrit");
            isNumberValid = false;
        } else {
            try {
                secondes1 = Double.parseDouble(valeur4);
            } catch (NumberFormatException e) {
                System.out.println("L'erreur est : " + e.getMessage());
                isNumberValid = false;
            }
        }

        double total1 = jours1 + heures1 + minutes1 + secondes1;
//        System.out.println(total1);

//        Deuxième phase de requête Jours/heures/minutes/secondes

        System.out.println("Veuillez écrire un nombre de jours");
        String valeur5 = sc.nextLine();
        valeur5 = valeur5.replace(',', '.');

        double jours2 = 0;

        if (valeur5.length() == 0) {
            System.out.println("Vous n'avez rien écrit");
            isNumberValid = false;
        } else {
            try {
                jours2 = Double.parseDouble(valeur5);
                jours2 = jours2 * 86400;
            } catch (NumberFormatException e) {
                System.out.println("L'erreur est : " + e.getMessage());
                isNumberValid = false;
            }
        }
        System.out.println("Veuillez écrire un nombre d'heures");
        String valeur6 = sc.nextLine();
        valeur6 = valeur6.replace(',', '.');

        double heures2 = 0;

        if (valeur6.length() == 0) {
            System.out.println("Vous n'avez rien écrit");
            isNumberValid = false;
        } else {
            try {
                heures2 = Double.parseDouble(valeur6);
                heures2 = heures2 * 3600;
            } catch (NumberFormatException e) {
                System.out.println("L'erreur est : " + e.getMessage());
                isNumberValid = false;
            }
        }
        System.out.println("Veuillez écrire un nombre de minutes");
        String valeur7 = sc.nextLine();
        valeur7 = valeur7.replace(',', '.');

        double minutes2 = 0;

        if (valeur7.length() == 0) {
            System.out.println("Vous n'avez rien écrit");
            isNumberValid = false;
        } else {
            try {
                minutes2 = Double.parseDouble(valeur7);
                minutes2 = minutes2 * 60;
            } catch (NumberFormatException e) {
                System.out.println("L'erreur est : " + e.getMessage());
                isNumberValid = false;
            }
        }
        System.out.println("Veuillez écrire un nombre de secondes");
        String valeur8 = sc.nextLine();
        valeur8 = valeur8.replace(',', '.');

        double secondes2 = 0;

        if (valeur8.length() == 0) {
            System.out.println("Vous n'avez rien écrit");
            isNumberValid = false;
        } else {
            try {
                secondes2 = Double.parseDouble(valeur8);
            } catch (NumberFormatException e) {
                System.out.println("L'erreur est : " + e.getMessage());
                isNumberValid = false;
            }
        }

        double total2 = jours2 + heures2 + minutes2 + secondes2;
//       System.out.println(total2);

        if (total1 > total2) {
            double total3 = 0;
            total3 = total1 - total2;
            double day3 = total3 / 86400;
            double hour3 = total3 % 86400 / 3600;
            double minute3 = total3 % 86400 % 3600 / 60;
            double sec3 = total3 % 86400 % 3600 % 60;

            System.out.printf("nombre de jours restants est %.0f\n", day3);
            System.out.printf("nombre d'heures restantes est %.0f\n", hour3);
            System.out.printf("nombre de minutes restantes est %.0f\n", minute3);
            System.out.printf("nombre de secondes restantes est %.0f\n", sec3);
 //           System.out.printf("La différence entre ces deux durées de %.0f jours, ", day3';' "%0f heures, ", hour3';' "%.Of minutes, ", minute3';' "%.Of seconds, ", sec3);

        } else {
            System.out.println("le calcul n'est pas faisable");
        }
    }
}

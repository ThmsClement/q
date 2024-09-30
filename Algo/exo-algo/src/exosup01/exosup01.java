package exosup01;

import java.util.Scanner;

public class exosup01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = "password";
        String testPassword = "raté";
        int numberTest = 3;
        boolean find = false;

        do {
            System.out.println("Veuillez saisir votre mot de passe");
            testPassword = (sc.nextLine());
            numberTest--;


            if (testPassword.equals(password)) {
                find = true;
                    System.out.println("Bienvenu(e)");
            } else {
            if ( numberTest > 1)
                System.out.println("Il vous reste " + numberTest + " essais");
            else {
                System.out.println("Il vous reste " + numberTest + " essai");
            }

            }
        } while ((find == false) && (numberTest != 0));
    }
}

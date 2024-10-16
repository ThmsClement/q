package exo21;

import java.util.*;

public class exo21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int justePrix = rand.nextInt(99) + 1;
        int proposition = 0;
        int numberProp = 0;

        do {

            System.out.println("Quel est votre proposition ?");
            proposition = Integer.parseInt(sc.nextLine());

            numberProp++;
            if (proposition < justePrix) {
                System.out.println("C'est plus!");
            } else if (proposition > justePrix) {
                System.out.println("C'est moins!");
            } else {
                System.out.println("C'est gagné!");
            }

        } while (justePrix != proposition);

        System.out.println("Votre nombre d'essai pour trouver le Juste Prix est de : " + numberProp);
    }
}

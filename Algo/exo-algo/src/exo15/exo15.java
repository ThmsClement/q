package exo15;

public class exo15 {
    public static void main(String[] args) {
        int valeur = 1;

        while (valeur <= 9) {
            System.out.println("Voiçi la table de multiplication du chiffre " + valeur + " :");
            int valeur2 = 1;

            while (valeur2 <= 10) {
                System.out.println(valeur + " * " + valeur2 + " = " + (valeur * valeur2));
                valeur2++;
            }
            valeur++;
        }
    }
}

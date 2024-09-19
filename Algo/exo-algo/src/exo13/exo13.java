package exo13;

public class exo13 {
    public static void main(String[] args) {
        System.out.println("Bonjour, voiçi la table de multiplication du chiffre 2 :");
        int valeur = 2;
        int valeur2 = 1;

        while (valeur2 <= 10) {
            System.out.println(valeur + "*" + valeur2 + "=" + (valeur * valeur2));
            valeur2 = valeur2 + 1;
        }
        System.out.println("Et voila :)");
    }
}

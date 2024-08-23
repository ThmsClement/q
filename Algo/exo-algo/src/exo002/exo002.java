package exo002;

import java.util.Scanner;

public class exo002 {
    public static void main(String[] args) {
        System.out.println("ecrit ton nom :");
        Scanner sc = new Scanner(System.in); //Pour créer un scanner
        String nom = sc.nextLine();
        System.out.println("hello " + nom);
        System.out.println("ecrit ton prénom :");
        String modifiedName = sc.nextLine();
        System.out.println("Bonjour " + modifiedName + " " + nom);
    }
}

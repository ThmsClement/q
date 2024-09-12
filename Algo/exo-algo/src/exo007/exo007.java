package exo007;

import java.util.Scanner;

public class exo007 {
    public static void main(String[] args) {
        System.out.println("entrez une année :");
        Scanner sc = new Scanner(System.in);
        int year = Integer.parseInt(sc.nextLine());
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("Vrai");
        }
        else {
            System.out.println("Faux");
        }

    }
}

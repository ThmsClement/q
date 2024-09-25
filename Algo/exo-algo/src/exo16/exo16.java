package exo16;

import java.util.Scanner;

public class exo16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quel est le juste prix ?");
        int justeprix = Integer.parseInt(sc.nextLine());

        System.out.println("Quel est votre proposition ?");
        int proposition = Integer.parseInt(sc.nextLine());

        if (proposition < justeprix) {
            System.out.println("C'est plus!");
        } else if (proposition > justeprix) {
            System.out.println("C'est moins!");
        }else {
            System.out.println("C'est gagné!");
        }
    }
}

package exo33;

import java.util.Scanner;

public class exo33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean ok = true;

        while(ok) {

            System.out.println("Entrer un nombre :");
            int number = Integer.parseInt(sc.nextLine());
            int result = squareOf(number);

            System.out.println("le carré de " + number + " est " + result);

            System.out.println("Voulez-vous faire une nouvelle partie ?");
            String choice = sc.nextLine();
            if (!choice.equals("yes")) {
                ok = false;
                System.out.println("Bonne continuation");
            }
        }

    }


    public static int squareOf(int num) {
        return num * num;
    }
}

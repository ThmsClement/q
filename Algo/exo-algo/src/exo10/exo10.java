package exo10;

import java.util.Scanner;

public class exo10 {
    public static void main(String[] args) {
        System.out.println("Veuillez choisir un nombre");
        Scanner sc = new Scanner(System.in);
        double number1 = Double.parseDouble(sc.nextLine());


        System.out.println("Veuillez choisir un opérateur");
        String operator = sc.nextLine();

        System.out.println("Veuillez choisir un deuxième nombre");
        double number2 = Double.parseDouble(sc.nextLine());

        switch (operator) {
            case "-":
                System.out.println("Le résultat est :" + (number1 - number2));
                break;

            case "+":
                System.out.println("Le résultat est :" + (number1 + number2));
                break;

            case "*":
                System.out.println("Le résultat est :" + (number1 * number2));
                break;

            case "/":
                if (number2 == 0) {
                    System.out.println("La division par 0 est impossible");
                }
                else {
                    System.out.println("Le résultat est :" + (number1 / number2));
                }
                break;

            default:
                System.out.println("Le choix n'est pas valide");
                break;
        }


    }
}

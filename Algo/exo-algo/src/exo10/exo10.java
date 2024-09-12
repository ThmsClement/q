package exo10;

import java.util.Scanner;

public class exo10 {
    public static void main(String[] args) {
        System.out.println("Veuillez choisir un nombre");
        Scanner sc = new Scanner(System.in);
        String n1 = sc.nextLine();
        n1 = n1.replace(',', '.');
        boolean isNumber1Valid = true;

        double number1 = 0;

        if (n1.length() == 0) {
            isNumber1Valid = false;
        } else {
            try {
                number1 = Double.parseDouble(n1);
            } catch (NumberFormatException e) {
//                System.out.println("L'erreur est : " + e.getMessage());
                isNumber1Valid = false;
            }
        }

        if (isNumber1Valid) {

            System.out.println("Veuillez choisir un opérateur");
            char operator = sc.nextLine().charAt(0);


            if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {

                System.out.println("Veuillez choisir un deuxième nombre");
                String n2 = sc.nextLine();

                n2 = n2.replace(',', '.');

                boolean isNumber2Valid = true;
                double number2 = 0;


                if (n2.length() == 0) {
                    isNumber2Valid = false;
                } else {
                    try {
                        number2 = Double.parseDouble(n2);
                    } catch (NumberFormatException e) {
//                System.out.println("L'erreur est : " + e.getMessage());
                        isNumber2Valid = false;
                    }
                }

                if (isNumber2Valid) {
                    switch (operator) {
                        case '-':
                            System.out.println("Le résultat est :" + (number1 - number2));
                            break;

                        case '+':
                            System.out.println("Le résultat est :" + (number1 + number2));
                            break;

                        case '*':
                            System.out.println("Le résultat est :" + (number1 * number2));
                            break;

                        case '/':
                            if (number2 == 0) {
                                System.out.println("La division par 0 est impossible");
                            } else {
                                System.out.println("Le résultat est :" + (number1 / number2));
                            }
                            break;

                        default:
                            System.out.println("Le choix n'est pas valide");
                            break;
                    }
                } else {
                    System.out.println("Number2 invalide. Verifier que l'on entre un nombre");
                }


            } else {
                System.out.println("Verifier que votre opérateur est un operateur valide ( (+, -, *, /)");
            }


        } else {
            System.out.println("Number1 invalide. Verifier que l'on entre un nombre");
        }


    }
}

package exo18;

import java.util.Scanner;

public class exo18 {
    public static void main(String[] args) {
        boolean autreCalcul = true;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Veuillez choisir un nombre");
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
                char operator = ' ';

                do {
                    System.out.println("Veuillez choisir un opérateur");
                    operator = sc.nextLine().charAt(0);


                    if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {

                        boolean isNumber2Valid = true;

                        do {
                            System.out.println("Veuillez choisir un deuxième nombre");
                            String n2 = sc.nextLine();

                            n2 = n2.replace(',', '.');

                            double number2 = 0;
                            isNumber2Valid = true;
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

                                System.out.println("Voulez-vous faire un autre calcul ?");

                                autreCalcul = Boolean.parseBoolean(sc.nextLine());

                            } else {
                                System.out.println("Number2 invalide. Verifier que l'on entre un nombre");
                            }
                        } while (!isNumber2Valid);


                    } else {
                        System.out.println("Verifier que votre opérateur est un operateur valide ( (+, -, *, /)");
                    }
                } while (operator != '+' && operator != '*' && operator != '/');


            } else {
                System.out.println("Number1 invalide. Verifier que l'on entre un nombre");
            }

        } while (autreCalcul);
        System.out.println("Bonne journée");
    }
}



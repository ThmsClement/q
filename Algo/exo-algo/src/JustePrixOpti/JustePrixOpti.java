package JustePrixOpti;

import java.util.Random;
import java.util.Scanner;


public class JustePrixOpti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int proposition = 0;
        int numberProp = 10;
        int lvl = 0;
        String chaine = "a";
        boolean choixNiveau = true;
        boolean testProposition = true;
        boolean autrePartie = true;


        do {


            System.out.println("Veuillez choisir le niveau désiré");
            System.out.println("1 : Facile : entre 1 et 10");
            System.out.println("2 : Moyen : entre 1 et 100");
            System.out.println("3 : Difficile : entre 1 et 1000");


            while (choixNiveau) {
                String level = sc.nextLine();

                if (level.isEmpty()) {
                    System.out.println("Merci d'entrer un chiffre entre 1 et 3");
                } else {
                    try {
                        lvl = Integer.parseInt(level);
                    } catch (NumberFormatException e) {
                        System.out.println("Merci d'entrer un chiffre entre 1 et 3");

                    }
                }

                if (estEntier(level)) {
                    lvl = Integer.parseInt(level);
                    if ((lvl >= 1) && (lvl <= 3)) {
                        choixNiveau = false;
                    } else {
                        System.out.println("Merci d'entrer un entier entre 1 et 3");
                    }
                }
            }
            choixNiveau = true;

            switch (lvl) {
                case 1:
                    int justePrixFacile = rand.nextInt(9) + 1;

                    do {

                        System.out.println("Quel est votre proposition ?");

                        while (testProposition) {
                            String analyseProposition = sc.nextLine();

                            if (estEntier(analyseProposition)) {
                                proposition = Integer.parseInt(analyseProposition);
                                testProposition = false;
                            } else {
                                System.out.println("Merci d'entrer un entier");
                            }
                        }
                        numberProp--;

                        if ((proposition < justePrixFacile) && (numberProp > 0)) {
                            System.out.println("C'est plus!");
                        } else if ((proposition > justePrixFacile) && (numberProp > 0)) {
                            System.out.println("C'est moins!");
                        } else if (numberProp > 0) {
                            System.out.println("C'est gagné!");
                        }
                        testProposition = true;
                    } while ((justePrixFacile != proposition) && (numberProp > 0));

                    if (numberProp == 0) {
                        System.out.println("C'est perdu");
                        System.out.println("le juste prix est : " + justePrixFacile);
                    }
                    break;


                case 2:
                    int justePrixMoyen = rand.nextInt(99) + 1;
                    do {

                        System.out.println("Quel est votre proposition ?");
                        while (testProposition) {
                            String analyseProposition = sc.nextLine();

                            if (estEntier(analyseProposition)) {
                                proposition = Integer.parseInt(analyseProposition);
                                testProposition = false;
                            } else {
                                System.out.println("Merci d'entrer un entier");
                            }
                        }
                        numberProp--;

                        if ((proposition < justePrixMoyen) && (numberProp > 0)) {
                            System.out.println("C'est plus!");

                        } else if ((proposition > justePrixMoyen) && (numberProp > 0)) {
                            System.out.println("C'est moins!");

                        } else if (numberProp > 0) {
                            System.out.println("C'est gagné!");
                        }
                        testProposition = true;
                    } while ((justePrixMoyen != proposition) && (numberProp > 0));

                    if (numberProp == 0) {
                        System.out.println("C'est perdu");
                        System.out.println("le juste prix est : " + justePrixMoyen);
                    }
                    break;

                case 3:

                    int justePrixDifficile = rand.nextInt(999) + 1;
                    do {

                        System.out.println("Quel est votre proposition ?");
                        while (testProposition) {
                            String analyseProposition = sc.nextLine();

                            if (estEntier(analyseProposition)) {
                                proposition = Integer.parseInt(analyseProposition);
                                testProposition = false;
                            } else {
                                System.out.println("Merci d'entrer un entier");
                            }
                        }
                        numberProp--;

                        if ((proposition < justePrixDifficile) && (numberProp > 0)) {
                            System.out.println("C'est plus!");
                        } else if ((proposition > justePrixDifficile) && (numberProp > 0)) {
                            System.out.println("C'est moins!");
                        } else if (numberProp > 0) {
                            System.out.println("C'est gagné!");
                        }
                        testProposition = true;
                    } while ((justePrixDifficile != proposition) && (numberProp > 0));

                    if (numberProp == 0) {
                        System.out.println("C'est perdu");
                        System.out.println("le juste prix est : " + justePrixDifficile);
                    }
                    break;
                default:
                    System.out.println("Le choix n'est pas valide");
            }
            boolean testAutrePartie = true;

            System.out.println("Voulez-vous faire une autre Partie ?");
            while (testAutrePartie) {
                String partie = sc.nextLine();


                if (partie.isEmpty()) {
                    System.out.println("Merci de répondre par True ou False");
                } else {
                    if ((partie.equalsIgnoreCase("True")) || (partie.equalsIgnoreCase("False"))){
                        autrePartie = Boolean.parseBoolean(partie);
                        testAutrePartie = false;
                    } else {
                        System.out.println("Merci de répondre par True ou False");
                    }
                }

            }
            numberProp = 10;
        } while (autrePartie);
        System.out.println("Bonne journée");

    }

    public static boolean estEntier(String chaine) {
        try {
            Integer.parseInt(chaine);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }


}


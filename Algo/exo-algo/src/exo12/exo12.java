package exo12;

import java.util.Scanner;

public class exo12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Pour la durée 1 : " + "\nEntrez le nombre de jours : ");
        int joursA = Integer.parseInt(sc.nextLine());
        System.out.println("Entrez le nombre de heures : ");
        int heuresA = Integer.parseInt(sc.nextLine());
        System.out.println("Entrez le nombre de minutes : ");
        int minutesA = Integer.parseInt(sc.nextLine());
        System.out.println("Entrez le nombre de secondes : ");
        int secondesA = Integer.parseInt(sc.nextLine());

        System.out.println("Pour la durée 2 : " + "\nEntrez le nombre de jours : ");
        int joursB = Integer.parseInt(sc.nextLine());
        System.out.println("Entrez le nombre de heures : ");
        int heuresB = Integer.parseInt(sc.nextLine());
        System.out.println("Entrez le nombre de minutes : ");
        int minutesB = Integer.parseInt(sc.nextLine());
        System.out.println("Entrez le nombre de secondes : ");
        int secondesB = Integer.parseInt(sc.nextLine());

        int time1 = joursA * 86400 + heuresA * 3600 + minutesA * 60 + secondesA;
        int time2 = joursB * 86400 + heuresB * 3600 + minutesB * 60 + secondesB;

        /* la version longue
        if (time1 >= time2) {
            int time3 = (time1 - time2);
            int timeRJ1 = (time3 / 86400), timeRH1 = time3 % 86400 / 3600, timeRM1 = time3 % 86400 % 3600 / 60, timeRS1 = time3 % 86400 % 3600 % 60;
            System.out.println("La différence entre ces 2 durées est de : " + "\n"+ timeRJ1 + "j, " + timeRH1 + "h, " + timeRM1 + "m, " + timeRS1 + "s");
        } else if (time1 <= time2) {
            int time4 = (time2 - time1);
            int timeRJ2 = (time4 / 86400), timeRH2 = (time4 % 86400 / 3600), timeRM2 = (time4 % 86400 % 3600 / 60), timeRS2 = (time4 % 86400 % 3600 % 60);
            System.out.println("La différence entre ces 2 durées est de : " + "\n"+ timeRJ2 + "j, " + timeRH2 + "h, " + timeRM2 + "m, " + timeRS2 + "s");
         */
        int diff = Math.abs(time1 - time2);

        // convertir les secondes en j, h, m, s
        int j, h, m, s;
        j = diff / 86400;
        h = diff % 86400 / 3600;
        m = diff % 86400 % 3600 / 60;
        s = diff % 86400 % 3600 % 60;

        // afficher la réponse
        System.out.println("La différence entre ces 2 durées est de :");
        System.out.println(j + "j, " + h + "h, " + m + "m, " + s + "s");

    }
}

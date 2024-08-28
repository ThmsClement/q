package exo005;

import java.util.Scanner;

public class exo005 {
    public static void main(String[] args) {
        System.out.println("Entrer le nombre de secondes à convertir :");
        Scanner sc = new Scanner(System.in);
        int secondes = Integer.parseInt(sc.nextLine());
        int day = secondes / 86400;
        int hour = secondes % 86400 / 3600;
        int minute = secondes % 86400 % 3600 / 60;
        int sec = secondes % 86400 % 3600 % 60;
        System.out.println(secondes + " secondes est égal à " + day + "jour, " + hour + "heures, " + minute + "minutes et "+ sec + "secondes");
    }
}

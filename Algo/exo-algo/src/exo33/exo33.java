package exo33;

import java.util.Scanner;

public class exo33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entrer un nombre :");
        int number = Integer.parseInt(sc.nextLine());
        int result = squareOf(number);

        System.out.println("le carré de " + number + " est " + result);

    }


    public static int squareOf(int num) {
        return num * num;
    }
}

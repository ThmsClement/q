package exo28;

import java.util.Scanner;

public class exo28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {1,5,28,2,1};
        System.out.println("Veuillez entrer un entier");
        int choice = sc.nextInt();

        for ( int i = 0 ; i < array.length ; i++){
            if (choice == array[i]) {
                System.out.println("La position dans le tableau de l'entier trouvé est :" + i);
            } else if (choice != array[array.length-1] && i == array.length-1){
                System.out.println("-1");
            }
        }
    }
}

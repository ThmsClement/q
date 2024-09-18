package exemples;

import java.util.Scanner;

public class Why {

    public static void main(String[] args) {
        System.out.println("Is this true?");
        Scanner sc = new Scanner(System.in);
        boolean bool = Boolean.parseBoolean(sc.nextLine());

        while (!bool) {
            System.out.println("It's false");
            System.out.println("Still false ?");
            bool = Boolean.parseBoolean(sc.nextLine());
        }
        System.out.println("True !");
    }
}

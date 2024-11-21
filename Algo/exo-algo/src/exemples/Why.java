package exemples;

import java.util.Arrays;
import java.util.Scanner;

public class Why {

    public static void main(String[] args) {
//        System.out.println("Is this true?");
//        Scanner sc = new Scanner(System.in);
//        boolean bool = Boolean.parseBoolean(sc.nextLine());
//
//        while (!bool) {
//            System.out.println("It's false");
//            System.out.println("Still false ?");
//            bool = Boolean.parseBoolean(sc.nextLine());
//        }
//        System.out.println("True !");
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        printArray(array1);

        int[] array2 = {4, 8, 12};
        printArray(array2);
        printArray(array1);

        boolean res = isArraySize10(array1);
        System.out.println(res);
        res = isArraySize10(array2);
        System.out.println(res);

        String str1 = "Hello";
        String str2 = returnString(str1);
        System.out.println(str1);
        System.out.println(str2);
    }

    static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    static boolean isArraySize10(int[] array) {
        if (array.length == 10) {
            return true;
        }
        return false;
    }

    static String returnString(String str) {
        return str + " World";
    }
}

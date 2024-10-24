package exo22;

public class exo22 {
    public static void main(String[] args) {
        int arraySize = 6;
        int[] array = new int[arraySize];
        int element = 1;
        int y = 0;

        while (y < array.length) {
            System.out.println("Elément a insérer " + element + " :");
            array[y] = element;
            element++;
            y++;
        }

        y = 0;
        System.out.println("Le tableau contient :");
        while (y < array.length) {
            System.out.println(array[y]);
            y++;
        }

//        FOR loop
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        //FOR n2
        for (int value : array) {
            System.out.println(value);
        }
    }
}

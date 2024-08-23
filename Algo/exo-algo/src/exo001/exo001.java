package exo001;

public class exo001 {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        System.out.println("a = "+ a);
        System.out.println("b = " + b);
        int c = a;
        a = b;
        b = c;
        System.out.println("a = "+ a);
        System.out.println("b = " + b);

    }
}

package src;

public class StarPattern {
    public static void main(String[] args) {

        // left to right star pattern

        int n=5;
        for (int i = 1; i <= n ; i++) {
            for (int j=1; j <= i; j++)
            {
                System.out.print("*");

            }
            System.out.println();

        }

        // right to left star pattern

        int a=6;
        for (int i = a; i >=1 ; i--) {
            for (int j=1; j <= i; j++)
            {
                System.out.print("*");

            }
            System.out.println();

        }

    }
}

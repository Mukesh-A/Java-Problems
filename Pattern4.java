import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("\t");
            }
            System.out.println("*");
        }

        //pattern 2

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("\t");
            }
            System.out.println("*");
        }
    }
}

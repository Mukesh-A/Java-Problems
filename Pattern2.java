import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        //pattern 1

        // for (int i = 1; i <= n; i++) {
        // for (int j = n; j >= i; j--) {
        // System.out.print("*");
        // }
        // System.out.println("\n");
        // }


        //pattern 2
        int sp = n - 1;
        int st = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            for (int k = 1; k <= st; k++) {

                System.out.print("*\t");
            }

            sp--;
            st++;
            System.out.println();
        }
    }
}

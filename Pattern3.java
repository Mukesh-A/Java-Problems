import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

         int sp = (n / 2) ;
        int st = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print("*\t");
            }
            for (int j = 1; j <= st; j++) {
                System.out.print("\t");
            }
            
            System.out.println("");

            if (i <= n / 2) {

                sp--;

                st += 2;

            } else {
                sp++;

                st -= 2;

            }
        }

//          code for above program
//                 *
//         *       *       *
// *       *       *       *       *
//         *       *       *
//                 *


        // int sp = (n / 2) +1;
        // int st = 1;

        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= sp; j++) {
        //         System.out.print("*\t");
        //     }
        //     for (int j = 1; j <= st; j++) {
        //         System.out.print("\t");
        //     }
        //     for (int j = 1; j <= sp; j++) {
        //         System.out.print("*\t");
        //     }
        //     System.out.println("");

        //     if (i <= n / 2) {

        //         sp--;

        //         st += 2;

        //     } else {
        //         sp++;

        //         st -= 2;

        //     }
        // }

        // above program output
// *       *       *               *       *       *
// *       *                               *       *
// *                                               *
// *       *                               *       *
// *       *       *               *       *       *
    }
}

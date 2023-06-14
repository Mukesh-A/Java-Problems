import java.util.Scanner;

public class MultiplyingAnyBase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int finalVal = multiplicationValue(b, n1, n2);

    }

    public static int multiplicationValue(int b, int n1, int n2) {

        int rv = 0;
        int carry = 0;

        int d1 = n1 % 10;
        n1 = n1 / 10;
        while (n1 > 0) {

            int d2 = n2 % 10;
            n2 = n2 / 10;

            int val = d1 * d2;

            carry = val / 8;
        }

        return rv;
    }
}

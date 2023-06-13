import java.util.Scanner;

public class AddingAnyBase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int DecimalValue = getBaseValue(n1, n2, b);
        System.out.println(DecimalValue);

    }

    public static int getBaseValue(int n1, int n2, int b) {
        int pow = 1;
        int carry = 0;
        int val1 = 0;
        while (n1 > 0 || n2 > 0 || carry > 0) {
            int digi1 = n1 % 10;
            int digi2 = n2 % 10;

            n1 = n1 / 10;
            n2 = n2 / 10;
            int val = digi1 + digi2 + carry;
            carry = val / b;
            val = val % b;
            val1 += val * pow;
            pow = pow * 10;

        }

        return val1;
    }
}

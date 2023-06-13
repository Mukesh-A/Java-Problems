import java.util.Scanner;

public class DecimalToBase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int base = scn.nextInt();

        // get base value
        int octValue = getBaseValue(n, base);
        System.out.println(octValue);
    }

    public static int getBaseValue(int n, int base) {
        int rv = 0;
        int pow = 1;
        while (n > 0) {
            int digi = n % base;
            n = n / base;
            rv += digi * pow;
            pow = pow * 10;
        }

        return rv;
    }
}

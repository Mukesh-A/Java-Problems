import java.util.Scanner;

public class AnyBaseToDecimal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int base = scn.nextInt();

        int DecimalValue = getBaseValue(n, base);
        System.out.println(DecimalValue);
    }

    public static int getBaseValue(int n, int base) {
        int rv = 0;

        int pow = 0;
        while (n > 0) {
            int digt = n % base;
            // System.out.println("digi" + digt);
            n = n / 10;
            rv += (int) digt * Math.pow(8, pow);
            // System.out.println("rv" + rv);
            pow++;

        }
        return rv;
    }
}

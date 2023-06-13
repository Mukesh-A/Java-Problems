import java.util.Scanner;

public class AnyBaseToAnyBase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int base1 = scn.nextInt();
        int base2 = scn.nextInt();

        int base10Value = getBaseValue(n, base1);
        System.out.println("base10Value"+base10Value);
        int finalValue = getBase2Value(base10Value, base2);
        System.out.println(finalValue);

        // for any base to any base first convert give base1 to 10 then from 10 convert
        // it to base2
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

    public static int getBase2Value(int base10Value, int base2) {
        int rv = 0;

        int pow = 1;
        while (base10Value > 0) {
            int digi = base10Value % base2;
            base10Value = base10Value / base2;
            rv += digi * pow;
            pow = pow * 10;

        }
        return rv;
    }

}

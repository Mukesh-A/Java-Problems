import java.util.Scanner;

public class RotateNum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int r = scn.nextInt();


        //counting numbers length

        int temp = n;
        int count = 0;
        while (temp > 0) {
            temp = temp / 10;
            count++;
        }

        // if rotation is 2 tyms then last two number will come to front ex: 12345 ->
        // 54123, if r=4 54321 if rotation is 350 then it is actual number how???
        // r%lengthOf number if its 0 then its same original number if reminder is 1 or
        // 2 or 3 then it is same as the rotation

        r = r % count;

        // if rotation is in -ve ex: 23146 -> 31462 first number to last

        if (r < 0) {
            r = +count;
        }

        int div = 1;
        int mul = 1;

        // generating number of place values to split the given number
        for (int i = 1; i <= count; i++) {
            if (i <= r) {
                div = div * 10;
            } else {
                mul = mul * 10;
            }

        }

        int rem = n % div;
        int quo = n / div;
        int result = rem * mul + quo;

        System.out.println(result);

    }
}
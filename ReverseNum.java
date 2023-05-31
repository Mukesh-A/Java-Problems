import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        while (n > 0) {
            int m = n % 10;
            n = n / 10;
            System.out.println(m);
        }
    }
}

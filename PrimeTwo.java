import java.util.Scanner;

public class PrimeTwo {
    public static void main(String[] args) {
        Scanner inpScanner = new Scanner(System.in);
        int low = inpScanner.nextInt();
        int high = inpScanner.nextInt();
        System.out.println("______________");
        for (int i = low; i <= high; i++) {
            int count = 0;
            for (int j = 2; j*j <= i; j++) {
                if (i % j == 0) {
                    // System.out.println(i % j);
                    count++;
                    break;
                }
            }
            if (count == 0) {
               
                System.out.println(i);
            }
        }
    }
}

import java.util.Scanner;

class Primeone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("how many number");
        int t = input.nextInt();
        System.out.println("enter the numbers");
        for (int i = 0; i < t; i++) {
            int n = input.nextInt();
            int count = 0;
            for (int j = 1; j <= n; j++) {
                if (n%j == 0) {
                    count++;
                }
            }
            if(count == 2){
                System.out.println("its prime");

            }else{
                System.out.println("not a prime");
            }
        }

    }
}
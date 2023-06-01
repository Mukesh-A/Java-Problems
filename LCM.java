import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        // largest number is stored in lcm
        int lcm = n1 > n2 ? n1 : n2;

        while(true){
            if(lcm%n1 == 0 && lcm%n2 == 0){
                System.out.printf("lcm of %d and %d is %d", n1,n2,lcm);
                break;
            }
            lcm++;
        }
    }
}

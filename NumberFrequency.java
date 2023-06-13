import java.util.Scanner;

public class NumberFrequency {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int digi = scn.nextInt();
        int count = 0;
        while(n>0){
            int r = n%10;
            if(r == digi){
                count++;
            }
            n = n/10;
        }
        System.out.println(count);


    }
}

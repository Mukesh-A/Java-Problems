import java.util.Scanner;

public class PrintNum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int temp = n;
        int count = 0;

        while (temp != 0) {
            temp = temp / 10;
            count++;
        }

        // count variable have the length of the number so nw lets divisible number
        int div = (int) Math.pow(10, count - 1); // this will b like 10^ count-1 ex: nw number is 12345 then count value is 5. To get only first place of the number we have to do length of the number -1,so it is count -1


        //n =1234
        while (div != 0) {
            int q = n / div; //q=1
            System.out.println(q); //1
            n = n % div; // 234
            div = div /10; // 100
        }

    }
}

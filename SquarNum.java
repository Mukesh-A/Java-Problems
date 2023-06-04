import java.util.Scanner;

public class SquarNum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();

        for (int i = 1; i * i < n1; i++) {
            System.out.println(i * i);
        }
    }
}

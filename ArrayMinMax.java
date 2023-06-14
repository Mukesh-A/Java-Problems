import java.util.Scanner;

public class ArrayMinMax {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        int min = arr[0];
        int max = arr[n - 1];

        for (int i = 0; i < arr.length; i++) {
        
            if (arr[i] <= min) {
                min = arr[i];
            }
            if (arr[i] >= max) {
                max = arr[i];
            }
        }
        System.out.println("min"+min );
        System.out.println("max"+max);
        int diff = max-min;
        System.out.println("diff"+diff);
    }
}

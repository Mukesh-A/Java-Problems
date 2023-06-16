import java.util.Scanner;

public class ArrayPrintingBar {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("---" + max);
        for (int floor = max; floor > 0; floor--) {

            for (int j = 0; j < arr.length; j++) {
                if (floor > arr[j]) {
                    System.out.print("\t");
                } else {
                    System.out.print("*\t");

                }
            }
            System.out.println();
        }

    }
}

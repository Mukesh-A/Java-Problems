import java.util.Scanner;

public class ArrayElementPosition {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        int find = scn.nextInt();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == find){
                
                System.out.println("output"+ i);
                break;
            }
        }
    }
}

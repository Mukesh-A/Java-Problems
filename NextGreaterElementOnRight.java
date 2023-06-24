import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElementOnRight {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            int ele = scn.nextInt();
            arr[i] = ele;
        }
        st.push(-1);
        for (int index = arr.length; index < 0; index--) {
            if(st.peek() < arr[index]){
                st.push(arr[index]);
            }
        }
    }
}

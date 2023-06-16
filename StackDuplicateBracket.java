import java.util.Scanner;
import java.util.Stack;

public class StackDuplicateBracket {
    public static void main(String[] args) {
        Stack<Character> st = new Stack<>();
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ')') {
                if (st.peek() == '(') { // this if loop is for the begining bracket
                    System.out.println(st+ " "+true);
                    return;
                } else {
                    while (st.peek() != '(' ) {
                        st.pop();
                    }
                    st.pop(); // even the last ( should be poped so used this
                }
            } else {
                st.push(ch);
            }
        }
        System.out.println(false);
    }
}

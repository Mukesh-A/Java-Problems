import java.util.Scanner;
import java.util.Stack;

public class StackMatchBracket {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String str = scn.nextLine();
        Stack<Character> sc = new Stack<>();

        for (int index = 0; index < str.length(); index++) {
            char ch = str.charAt(index);
            if (ch == '(' || ch == '[' || ch == '{') {
                sc.push(ch);
                System.out.println(sc);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                System.out.println("size" + sc.size());
                if (sc.peek() == '{') {
                    System.out.println("1" + sc.peek());
                    sc.pop();
                    System.out.println(false);
                    break;
                } else if (sc.size() == 0) {
                    System.out.println("2" + sc.peek());
                    sc.pop();

                    System.out.println(false);
                    break;
                } else if (sc.peek() == '(') {
                    System.out.println("3" + sc.peek());
                    sc.pop();

                    System.out.println(false);
                    break;
                } else if (sc.peek() == '[') {
                    System.out.println("4" + sc.peek());
                    sc.pop();

                    System.out.println(false);
                    break;
                } else {
                    sc.pop();
                    System.out.println("5" + sc);

                }
            }
            System.out.println("last" + sc);

        }
        if (sc.size() == 0) {
            System.out.println(true);
            System.out.println("lastsssssss");

        } else {
            System.out.println("lastsssssss");
            System.out.println(false);

        }

    }
}

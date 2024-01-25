//https://leetcode.com/problems/valid-parentheses/submissions/
import java.util.Scanner;
import java.util.Stack;

public class validPrarentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- != 0){

            String str = sc.next();
            if (isValid(str)){
                System.out.println("true");
            } else {
                System.out.println("false");
            }

        }

        sc.close();
    }
    public static boolean isValid(String s) {

        if (s == null || s.length() == 0) {
            return true;
        }
        char[] c_arr = s.toCharArray();
        Stack<Character> stack = new Stack<Character>();
        for (Character c : c_arr) {
            if (stack.isEmpty()) {
                stack.push(c);
            } else if (c == ')' && stack.peek() == '(') {
                stack.pop();
            } else if (c == ']' && stack.peek() == '[') {
                stack.pop();
            } else if (c == '}' && stack.peek() == '{') {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty() ? true : false;

    }
}

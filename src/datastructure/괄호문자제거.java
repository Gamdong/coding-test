package datastructure;

import java.util.Scanner;
import java.util.Stack;

public class 괄호문자제거 {

    private String solution(String str) {

        StringBuilder sb = new StringBuilder();
        int sum = 0;
        for (char x : str.toCharArray()) {
            if (x == '(') sum += 1;
            else if (x == ')') sum -= 1;
            else {
                if (sum == 0) sb.append(x);
            }
        }
        return sb.toString();
    }

    private String solution2(String str) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (char x : str.toCharArray()) {
            if (x == ')') {
                while (stack.pop() != '(');
            } else {
                stack.push(x);
            }
        }

        for (int i = 0; i < stack.size(); i++) sb.append(stack.get(i));
        return sb.toString();
    }
    public static void main (String[] args) {
        괄호문자제거 T = new 괄호문자제거();
        Scanner in = new Scanner(System.in);

        String str = in.next();
        String ans = T.solution2(str);
        System.out.println(ans);
    }
}

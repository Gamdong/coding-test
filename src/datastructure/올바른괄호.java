package datastructure;

import java.util.Scanner;
import java.util.Stack;

public class 올바른괄호 {

    private String solution(String str) {

        int sum = 0;
        for (char x: str.toCharArray()) {
            if (x == '(') sum += 1;
            else sum -= 1;

            if (sum < 0) return "NO";
        }

        return (sum == 0) ? "YES" : "NO";
    }

    private String solution2(String str) {
        String ans = "YES";

        Stack<Character> stack = new Stack<>();
        for (char x : str.toCharArray()) {
            if (x == '(') stack.push('(');
            else {
                if (stack.isEmpty()) {
                    ans = "NO";
                    break;
                }
                stack.pop();
            }
        }

        if (!stack.isEmpty()) ans = "NO";
        return ans;
    }
    public static void main(String[] args) {
        올바른괄호 T = new 올바른괄호();
        Scanner in = new Scanner(System.in);

        String str = in.next();
        String ans = T.solution2(str);
        System.out.println(ans);
    }
}

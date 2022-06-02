package datastructure;

import java.util.Scanner;
import java.util.Stack;

public class 후위식연산 {
    private int solution(String s) {
        Stack<Integer> stack = new Stack<>();

        for (char x : s.toCharArray()) {
            if (Character.isDigit(x)) {
                stack.push(Character.getNumericValue(x));
            } else {
                int rt = stack.pop();
                int lt = stack.pop();
                int calc = calc(x, lt, rt);
                stack.push(calc);
            }
        }
        return stack.get(0);
    }

    private int calc(char s, int lt, int rt) {
        int x = 0;
        switch(s) {
            case '+' : x = lt + rt;
                break;
            case '-' : x = lt - rt;
                break;
            case '/' : x = lt / rt;
                break;
            case '*' : x = lt * rt;
                break;
        }
        return x;
    }

    public static void main (String[] args) {
        후위식연산 T = new 후위식연산();
        Scanner in = new Scanner(System.in);

        String input = in.next();
        int ans = T.solution(input);
        System.out.println(ans);
    }
}

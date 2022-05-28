package string;

import java.util.Scanner;

public class 회문문자열 {

    private boolean solution(String input) {
        input = input.toUpperCase();
        String reversed = new StringBuilder(input).reverse().toString();
        return (input.equals(reversed));
    }
    public static void main(String[] args) {

        회문문자열 T = new 회문문자열();
        Scanner in = new Scanner(System.in);

        String input = in.next();
        boolean ans = T.solution(input);

        System.out.println((ans) ? "YES" : "NO");
    }
}

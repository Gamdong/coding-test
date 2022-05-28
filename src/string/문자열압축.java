package string;

import java.util.Scanner;

public class 문자열압축 {

    private String solution(String input) {

        input += " ";
        StringBuilder sb = new StringBuilder();
        int sameCount = 1;
        for (int i = 0; i < input.toCharArray().length; i++) {
            char curr = input.charAt(i);
            if (curr == ' ') {
                break;
            }
            char next = input.charAt(i+1);

            if (curr == next) {
                sameCount++;
            }
            else {
                sb.append(curr);
                if (sameCount > 1) sb.append(sameCount);

                sameCount = 1;
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {

        문자열압축 T = new 문자열압축();

        Scanner in = new Scanner(System.in);
        String input = in.next();
        String out = T.solution(input);

        System.out.println(out);
    }
}

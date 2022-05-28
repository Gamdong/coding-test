package string;

import java.util.Scanner;

public class 중복문자제거 {

    public String solution(String input) {

        String ans = "";
        for (char x : input.toCharArray()){
            ans = (ans.indexOf(x) == -1)? ans + x : ans;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.next();

        중복문자제거 T = new 중복문자제거();
        String answer = T.solution(input);
        System.out.println(answer);
    }
}

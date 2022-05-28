package string;

import java.util.Scanner;

public class 숫자만추출 {

    private int solution(String input) {
        input = input.replaceAll("[^0-9]", "");
        return Integer.valueOf(input);
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String input = in.next();

        숫자만추출 T = new 숫자만추출();
        int ans = T.solution(input);
        System.out.println(ans);
    }
}

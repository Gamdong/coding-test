package string;

import java.util.Scanner;

public class 가장짧은문자거리 {

    private int[] solution(String s, char t) {

        s = s.toLowerCase();
        int[] arrLeft = new int[s.length()];
        int[] arrRight = new int[s.length()];
        int distanceFromLtc = s.length();
        int distanceFromRtc = s.length();

        for (int i = 0; i < s.length(); i++) {
            char lX = s.charAt(i);
            char rX = s.charAt(s.length() - i - 1);

            if (lX == t) {
                distanceFromLtc = 0;
            } else {
                distanceFromLtc++;
            }
            arrLeft[i] = distanceFromLtc;

            if (rX == t) {
                distanceFromRtc = 0;
            }
            else {
                distanceFromRtc++;
            }
            arrRight[s.length() - i - 1] = distanceFromRtc;
        }

        int[] ans = new int[s.length()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = Math.min(arrLeft[i], arrRight[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        가장짧은문자거리 T = new 가장짧은문자거리();
        Scanner in = new Scanner(System.in);

        String input = in.next();
        char find = in.next().charAt(0);

        int[] ans = T.solution(input, find);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ans.length; i++) {
            int x = ans[i];
            sb.append(x);
            if (i < ans.length -1) sb.append(" ");
        }

        System.out.println(sb.toString());
    }
}

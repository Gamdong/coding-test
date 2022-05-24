import java.util.Scanner;

public class 회문문자열 {

    private boolean solution(String input) {
        boolean is회문문자열 = true;
        input = input.toUpperCase();

        int left = 0;
        int right = input.length();
        while (left < right && is회문문자열) {
            if (input.charAt(left) != input.charAt(right -1)) {
                is회문문자열 = false;
            }
            else {
                left++;
                right--;
            }
        }

        return is회문문자열;
    }
    public static void main(String[] args) {

        회문문자열 T = new 회문문자열();
        Scanner in = new Scanner(System.in);

        String input = in.next();
        boolean ans = T.solution(input);

        System.out.println((ans) ? "YES" : "NO");
    }
}

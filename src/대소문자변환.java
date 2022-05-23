import java.util.Scanner;

public class 대소문자변환 {

    public String solution(String str) {
        String ans = "";
        for (char x : str.toCharArray()) {
            ans += (Character.isUpperCase(x)) ? Character.toLowerCase(x) : Character.toUpperCase(x);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.next();

        대소문자변환 T = new 대소문자변환();
        String ans = T.solution(input);
        System.out.println(ans);

        return;
    }
}

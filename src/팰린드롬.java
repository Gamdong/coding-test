import java.util.Scanner;
public class 팰린드롬 {

    private boolean solution(String input) {
        input = input.toUpperCase().replaceAll("[^A-Z]", "");
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equals(reversed);
    }
    public static void main(String[] args) {

        팰린드롬 T = new 팰린드롬();
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        boolean isResult = T.solution(input);
        System.out.println((isResult) ? "YES" : "NO");
    }
}

package string;

import java.util.Scanner;

public class 암호 {
    private String solution(int count, String input) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            String binary = input.substring(0, 7)
                    .replace('#', '1')
                    .replace('*', '0');

            int decimal = Integer.parseInt(binary, 2);
            sb.append((char) decimal);

            input = input.substring(7);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count = in.nextInt();
        String input = in.next();

        암호 T = new 암호();
        String encrypted = T.solution(count, input);

        System.out.println(encrypted);
    }
}

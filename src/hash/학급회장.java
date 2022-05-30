package hash;

import java.util.HashMap;
import java.util.Scanner;

public class 학급회장 {
    private char solution(String input) {
        char ans = 0;
        int count = 0;
        HashMap<Character, Integer> bt = new HashMap<>();

        for (char x: input.toCharArray()) {
            boolean hasKey = bt.containsKey(x);
            if (!hasKey) {
                bt.put(x, 1);
            } else {
                int value = bt.get(x) + 1;
                bt.put(x, value);

                if (count < value) {
                    count = value;
                    ans = x;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        학급회장 T = new 학급회장();
        Scanner in = new Scanner(System.in);

        int cnt = in.nextInt();
        String input = "";
        input += in.next();

        char ans = T.solution(input);
        System.out.println(ans);
    }
}

package hash;

import java.util.HashMap;
import java.util.Scanner;

public class 아나그램 {
    private String solution(String inp1, String inp2) {

        HashMap<Character, Integer> m = new HashMap<>();
        for (char x: inp1.toCharArray()) {
            m.put(x, m.getOrDefault(x, 0) + 1);
        }

        for (char x: inp2.toCharArray()) {
            if (!m.containsKey(x) || m.get(x) == 0) return "NO";
            m.put(x, m.get(x) -1);
        }

        for (char x: m.keySet()) {
            if (m.get(x) != 0) return "NO";
        }

        return "YES";
    }
    public static void main (String[] args) {
        아나그램 T = new 아나그램();
        Scanner in = new Scanner(System.in);

        String input1 = in.next();
        String input2 = in.next();

        String ans = T.solution(input1, input2);
        System.out.println(ans);
    }
}

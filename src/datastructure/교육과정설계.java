package datastructure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 교육과정설계 {
    private String solution(String inp1, String inp2) {
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> list = new ArrayList<>();
        for (char x : inp1.toCharArray()) {
            int idx = inp2.indexOf(x);
            list.add(idx);
        }

        int idx = -1;
        for (int x : list) {
            if (idx > x ) return "NO";
            else {
                idx = x;
            }
        }
        return "YES";
    }
    private String solution2(String std, String sc) {
        Queue<Character> q = new LinkedList<Character>();
        for (char x: std.toCharArray()) q.offer(x);

        for (char x : sc.toCharArray()) {
            if (q.contains(x)) {
                if (q.poll() != x) return "NO";
            }
        }

        return q.size() > 0 ? "NO" : "YES";
    }
    public static void main (String[] args) {
        교육과정설계 T = new 교육과정설계();
        Scanner in = new Scanner(System.in);
        String inp1 = in.next();
        String inp2 = in.next();

        String ans = T.solution2(inp1, inp2);
        System.out.println(ans);

    }
}

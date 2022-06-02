package datastructure;

import java.util.*;

public class 공주구하기 {

    private int solution(int n, int k) {
        int ans = 0;
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) q.offer(i + 1);
        int idx = 0;
        while(!q.isEmpty()) {
            for (int i = 1; i < k; i++) q.offer(q.poll());
            q.poll();
            if (q.size() == 1) ans = q.poll();
        }
        return ans;
    }
    public static void main(String[] args) {
        공주구하기 T = new 공주구하기();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();                   //왕자 수
        int k = in.nextInt();                   //제외 순번
        int ans = T.solution(n, k);
        System.out.println(ans);
    }
}

package array;

import java.util.*;
import java.util.stream.IntStream;

public class 등수구하기 {
    private int[] solution(int[] n) {

        //정렬
        int[] sorted = IntStream.of(n)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(i -> i)
                .toArray();

        int[] ans = new int[n.length];

        for (int nI = 0; nI < n.length; nI++) {
            int x = n[nI];
            for (int i = 0; i < sorted.length; i++) {
                if (x == sorted[i]) {
                    ans[nI] =  i + 1;
                    break;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int[] scores = new int[count];
        for (int i = 0; i < count; i++) scores[i] = in.nextInt();

        등수구하기 T = new 등수구하기();
        int[] ans = T.solution(scores);
        for (int x : ans) System.out.print(x + " ");
    }
}

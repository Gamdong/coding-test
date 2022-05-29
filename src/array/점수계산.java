package array;

import java.util.Scanner;

public class 점수계산 {
    private int solution(int[] n) {
        int plus = 0;
        int score = 0;
        for (int i = 0; i < n.length; i++) {
            if (n[i] == 0) {
                plus = 0;
            }
            else {
                score += (n[i] + plus);
                plus++;
            }
        }
        return score;
    }
    public static void main(String[] args) {
        점수계산 T = new 점수계산();
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int[] n = new int[count];
        for (int i = 0; i < count; i++) {
            n[i] = in.nextInt();
        }
        int score = T.solution(n);
        System.out.println(score);
    }
}

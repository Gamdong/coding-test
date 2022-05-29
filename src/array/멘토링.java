package array;

import java.util.Scanner;

public class 멘토링 {

    private int[][] sort (int n, int t, int[][] tmp) {
        int[][] s = new int[n][t];
        for (int i = 0; i < tmp.length; i++) {
            for (int j = 0; j < tmp[i].length; j++) {
                //x -> 학생
                //y -> 테스트 회차
                int student = tmp[i][j];
                s[student-1][i] = j;
            }
        }
        return s;
    }

    private int solution(int n, int t, int[][] s) {
        int ans = 0;

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                boolean isPass = true;
                for (int nT = 0; nT < t; nT++) {
                    if (s[i][nT] >= s[j][nT]) {
                        isPass = false;
                        break;
                    }
                }
                if (isPass) ans++;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        멘토링 T = new 멘토링();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int[][] score = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                score[i][j] = in.nextInt();
            }
        }
        int[][] sorted = T.sort(n, m, score);
        int ans = T.solution(n, m, sorted);
        System.out.println(ans);
    }
}

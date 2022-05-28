package array;

import java.util.Scanner;

public class 가위바위보 {
    private String[] solution(int n, int[] a, int[] b) {

        String[] ans = new String[n];
        for (int i = 0; i < n; i++) {
            String result = "A";
            if (a[i] == b[i]) {
                ans[i] = "D";
                continue;
            }
            switch (a[i]) {
                case 1: // 가위
                    ans[i] = (b[i] == 2) ? "B" :  "A";
                    break;
                case 2: // 바위
                    ans[i] = (b[i] == 3) ? "B" :  "A";
                    break;
                case 3: // 보
                    ans[i] = (b[i] == 1) ? "B" :  "A";
                    break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        for (int i = 0; i < n; i++) {
            b[i] = in.nextInt();
        }

        가위바위보 T = new 가위바위보();
        String[] ans = T.solution(n, a, b);
        for (String x : ans) {
            System.out.println(x);
        }
    }
}

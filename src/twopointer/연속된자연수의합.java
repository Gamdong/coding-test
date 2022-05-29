package twopointer;

import java.util.Scanner;
public class 연속된자연수의합 {
    private int solution(int n) {
        int ans = 0;
        for (int i = 1; i < n - 2; i++) {
            int sum = i;
            for (int j = i+1; j < n -1; j++) {
                sum += j;
                if (sum == n) {
                    ans++;
                    break;
                }
            }
        }
        return ans;
    }

    private int solution2(int n) {
        int m = (n / 2) + 1;
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) arr[i] = i + 1;

        int ans = 0;
        int lt = 0;
        int sum = 0;
        for (int rt = 0; rt < m; rt++) {
            sum += arr[rt];
            if (sum == n) ans++;
            while (sum >= n) {
                sum -= arr[lt++];
                if (sum == n) ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        연속된자연수의합 T = new 연속된자연수의합();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int ans = T.solution2(n);
        System.out.println(ans);
    }
}

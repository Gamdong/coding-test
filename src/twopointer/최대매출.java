package twopointer;

import java.util.Scanner;
public class 최대매출 {
    private int solution (int n, int k, int[] arr) {
        int ans = 0;
        for (int i = 0; i < k; i++) ans += arr[i];
        int sum = ans;
        for (int i = k; i < n; i++) {
            sum -= arr[i-k];
            sum += arr[i];
            ans = Math.max(sum, ans);
        }
        return ans;
    }

    public static void main(String[] args) {
        최대매출 T = new 최대매출();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); // 총 일
        int k = in.nextInt(); // 연속일

        int[] input = new int[n];
        for (int i = 0; i < n; i++) input[i] = in.nextInt();

        int ans = T.solution(n, k, input);
        System.out.println(ans);
    }
}

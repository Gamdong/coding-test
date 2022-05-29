package twopointer;

import java.util.Scanner;
public class 연속부분수열 {

    private int solution(int n, int m, int[] arr) {
        int ans = 0;

        for (int i = 0; i < n; i++) {
            int sum = arr[i];
            for (int j = i + 1; j < n; j++) {
                if (sum == m) ans ++;
                else if (sum > m) break;
                sum += arr[j];
            }
        }

        return ans;
    }

    private int solution2 (int n, int m, int[] arr) {
        int ans = 0;
        int lt = 0;
        int sum = 0;
        for (int rt = 0; rt < n; rt++) {
            sum += arr[rt];
            if (sum == m) ans++;
            while (sum >= m) {
                sum -= arr[lt++];
                if (sum == m) ans++;
            }
        }
        return ans;
    }
    public static void main (String[] args) {

        연속부분수열 T = new 연속부분수열();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) arr[i] = in.nextInt();

        int ans = T.solution2(n, m, arr);
        System.out.println(ans);
    }
}

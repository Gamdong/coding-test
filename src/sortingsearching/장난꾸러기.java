package sortingsearching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 장난꾸러기 {

    private int[] solution(int n, int[] arr) {
        int[] ans = new int[2];
        int[] ok = new int[n];
        for (int i = 0; i < arr.length; i++) ok[i] = arr[i];
        Arrays.sort(ok);
        for (int i = 0; i < n; i++) {
            if (arr[i] != ok[i]) {
                ans[(ans[0] != 0) ? 1 : 0] = i + 1;
            }
        }
        return ans;
    }

    public static void main (String[] args) {
        장난꾸러기 T = new 장난꾸러기();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = in.nextInt();
        int[] ans = T.solution(n, arr);
        for (int x : ans) System.out.print(x + " ");
    }
}

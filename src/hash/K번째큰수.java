package hash;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class K번째큰수 {

    private int solution(int n, int k, int[] arr) {

        TreeSet<Integer> tSet = new TreeSet<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int z = j + 1; z < n; z++) {
                    tSet.add(arr[i] + arr[j] + arr[z]);
                }
            }
        }

        int idx = 0;
        for (int x: tSet) {
            idx++;
            if (idx == k) return x;
        }
        return -1;
    }
    public static void main (String[] args) {
        K번째큰수 T = new K번째큰수();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) arr[i] = in.nextInt();

        int ans = T.solution(n, k, arr);
        System.out.println(ans);
    }
}

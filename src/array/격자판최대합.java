package array;

import java.util.Scanner;

public class 격자판최대합 {

    private int solution(int[][] arr) {
        int ans = 0;
        int h = 0;
        int v = 0;
        int c = 0;

        int lC = 0;
        int rC = 0;
        for (int i = 0; i < arr.length; i++) {
            int nV = 0;
            int nH = 0;
            for (int j = 0; j < arr[i].length; j++) {
                nV += arr[i][j];
                nH += arr[j][i];

                if (i == j) lC += arr[i][j];
                if (i + j == arr.length - 1) rC += arr[i][j];
            }
            //가로합
            if (nV > v) v = nV;
            if (nH > h) h = nH;
        }

        c = (lC > rC) ? lC : rC;
        ans = c;
        if (v > ans) ans = v;
        if (h > ans) ans = h;

        return ans;
    }

    public static void main(String[] args) {
        격자판최대합 T = new 격자판최대합();
        Scanner in = new Scanner(System.in);

        int length = in.nextInt();
        int[][] arr = new int[length][length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        int max = T.solution(arr);
        System.out.println(max);
    }
}

package sortingsearching;

import java.util.Arrays;
import java.util.Scanner;

public class 선택정렬 {

    private int[] solution(int[] arr) {
        int[] ans = arr;
        Arrays.sort(ans);
        return ans;
    }
    public static void main(String[] args) {
        선택정렬 T = new 선택정렬();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) arr[i] = in.nextInt();

        int[] ans = T.solution(arr);
        for (int x : ans) System.out.print(x + " ");
    }
}

package twopointer;

import java.util.Arrays;
import java.util.Scanner;
public class 두배열합치기 {
    private int[] solution(int[] a1, int[] a2) {
        int[] ans = new int[a1.length + a2.length];

        for (int i = 0; i < a1.length; i++) ans[i] = a1[i];
        for (int i = 0; i < a2.length; i++) ans[a1.length + i] = a2[i];

        return Arrays.stream(ans).sorted().toArray();
    }
    public static void main(String[] args) {
        두배열합치기 T = new 두배열합치기();
        Scanner in = new Scanner(System.in);

        int arr1Size = in.nextInt();
        int[] a1 = new int[arr1Size];
        for (int i = 0; i < a1.length; i++) {
            a1[i] = in.nextInt();
        }

        int arr2Size = in.nextInt();
        int[] a2 = new int[arr2Size];
        for (int i = 0; i < a2.length; i++) {
            a2[i] = in.nextInt();
        }

        int[] ans = T.solution(a1, a2);
        for (int x : ans) System.out.print(x + " ");
    }
}

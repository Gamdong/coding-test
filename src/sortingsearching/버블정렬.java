package sortingsearching;

import java.util.Scanner;

public class 버블정렬 {

    private int[] solution(int n, int[]arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int lt = 0;
            int rt = 1;
            while (rt < arr.length) {
                if (arr[lt] > arr[rt]) {
                    int tmp = arr[lt];
                    arr[lt] = arr[rt];
                    arr[rt] = tmp;
                }
                lt++;
                rt++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        버블정렬 T = new 버블정렬();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) arr[i] = in.nextInt();

        int[] ans = T.solution(n, arr);
        for (int x : ans) System.out.print(x + " ");
    }
}

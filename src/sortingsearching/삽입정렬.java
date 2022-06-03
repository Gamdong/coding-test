package sortingsearching;

import java.util.Scanner;

public class 삽입정렬 {
    private int[] solution(int n, int[]arr) {

        int target = 1;
        while (target < arr.length) {
            int lt = 0;
            int rt = lt + 1;
            while (rt <= target) {
                if (arr[lt] > arr[rt]) {
                    int tmp = arr[lt];
                    arr[lt] = arr[rt];
                    arr[rt] = tmp;

                    lt = 0;
                    rt = lt + 1;
                }
                else {
                    lt++;
                    rt++;
                }
            }
            target++;
        }
        return arr;
    }
    public static void main(String[] args) {
        삽입정렬 T = new 삽입정렬();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) arr[i] = in.nextInt();

        int[] ans = T.solution(n, arr);
        for (int x : ans) System.out.print(x + " ");
    }
}

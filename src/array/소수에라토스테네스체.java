package array;

import java.util.Scanner;
import java.util.ArrayList;
public class 소수에라토스테네스체 {

    private int solution(int n) {
        int[] arr = new int[n+1];
        ArrayList<Integer> pN = new ArrayList<>();
        for (int i = 2; i < arr.length; i++) {
            int curr = arr[i];
            if (curr == 0) {
                pN.add(i);
                int mIdx = i;
                while (mIdx <= n) {
                    arr[mIdx] = 1;
                    mIdx += i;
                }
            }
        }
        return pN.size();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        소수에라토스테네스체 T = new 소수에라토스테네스체();

        int input = in.nextInt();
        int ans = T.solution(input);
        System.out.println(ans);
    }
}

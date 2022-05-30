package hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class 매출액의종류 {

    private ArrayList<Integer> solution(int k, int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> m = new HashMap<>();

        int lt = 0;
        for (int rt = 0; rt < arr.length; rt++) {

            m.put(arr[rt], m.getOrDefault(arr[rt], 0) + 1);
            if ((rt - lt) == k - 1) {
                ans.add(m.size());
                int ltValue = m.get(arr[lt]) - 1;
                if (ltValue == 0) {
                    m.remove(arr[lt]);
                } else {
                    m.put(arr[lt], ltValue);
                }
                lt++;
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        매출액의종류 T = new 매출액의종류();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) arr[i] = in.nextInt();

        ArrayList<Integer> ans = T.solution(k, arr);
        for (int x: ans) System.out.print(x + " ");
    }
}

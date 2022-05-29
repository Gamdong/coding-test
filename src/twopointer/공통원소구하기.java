package twopointer;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class 공통원소구하기 {

    private ArrayList<Integer> solution(int[] arr1, int[] arr2) {
        ArrayList<Integer> ans = new ArrayList<>();

        arr1 = Arrays.stream(arr1).sorted().toArray();
        arr2 = Arrays.stream(arr2).sorted().toArray();

        for (int i = 0; i < arr1.length; i++) {
            int curr = arr1[i];
            for (int j = 0; j < arr2.length; j++) {
                if (curr == arr2[j]) {
                    ans.add(curr);
                    break;
                }
            }
        }
        return ans;
    }

    private ArrayList<Integer> solution2(int[] arr1, int[] arr2) {
        ArrayList<Integer> ans = new ArrayList<>();
        int p1 = 0;
        int p2 = 0;

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        while(p1 < arr1.length && p2 < arr2.length) {
            if (arr1[p1] == arr2[p2]) {
                ans.add(arr1[p1]);
                p1++;
                p2++;
            } else if (arr1[p1] < arr2[p2]) p1++;
            else p2++;
        }
        return ans;
    }

    public static void main(String[] args) {
        공통원소구하기 T = new 공통원소구하기();
        Scanner in = new Scanner(System.in);
        int s1 = in.nextInt();
        int[] arr1 = new int[s1];
        for (int i=0; i < arr1.length; i++) arr1[i] = in.nextInt();

        int s2 = in.nextInt();
        int[] arr2 = new int[s2];
        for (int i=0; i < arr2.length; i++) arr2[i] = in.nextInt();

        ArrayList<Integer> ans = T.solution2(arr1, arr2);
        for (int x : ans) System.out.print(x + " ");
    }
}

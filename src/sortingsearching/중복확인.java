package sortingsearching;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class 중복확인 {
    private String solution(int[] arr) {
        String ans = "U";
        Set<Integer> s = new HashSet<> ();
        for (int x : arr) s.add(x);

        return (arr.length != s.size()) ? "D" : "U";
    }

    public static void main(String[] args) {
        중복확인 T = new 중복확인();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) arr[i] = in.nextInt();

        String ans = T.solution(arr);
        System.out.println(ans);
    }
}

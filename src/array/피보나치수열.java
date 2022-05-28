package array;

import java.util.ArrayList;
import java.util.Scanner;

public class 피보나치수열 {

    private ArrayList<Integer> solution (int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        //n은 3이상
        ans.add(1);
        ans.add(1);

        while (ans.size() < n) {
            int frontIdx = ans.size() -1;
            int x = ans.get(frontIdx) + ans.get(frontIdx - 1);
            ans.add(x);
        }
        return ans;
    }

    public static void main(String[] args) {
        피보나치수열 T = new 피보나치수열();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        ArrayList<Integer> p = T.solution(n);
        p.forEach(x -> System.out.print(x + " "));
    }

}

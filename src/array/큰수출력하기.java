package array;

import java.util.ArrayList;
import java.util.Scanner;

public class 큰수출력하기 {

    private ArrayList<Integer> solution(int[] arr) {

        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = arr.length - 1; i >= 0; i--) {

            int n = arr[i];
            if (i == 0 || arr[i] > arr[i-1]) ans.add(0, n);
        }
        return ans;
    }

    public static void main(String[] args) {
        큰수출력하기 T = new 큰수출력하기();

        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }

        ArrayList<Integer> ans = T.solution(arr);
        ans.forEach(n -> {
            System.out.print(n + " ");
        });
    }

}

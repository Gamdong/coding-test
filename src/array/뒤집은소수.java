package array;

import java.util.ArrayList;
import java.util.Scanner;

public class 뒤집은소수 {
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int x: arr) {
            String strX = new StringBuilder(String.valueOf(x)).reverse().toString();
            int rX = Integer.valueOf(strX);
            boolean isPrimeNumber = true;
            int n = 2;
            while (isPrimeNumber && n < rX) {
                isPrimeNumber = (rX % n != 0);
                n++;
            }
            if (isPrimeNumber && rX > 1) ans.add(rX);
        }
        return ans;
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        뒤집은소수 T = new 뒤집은소수();
        ArrayList<Integer> ans = T.solution(arr);
        ans.forEach(x -> System.out.print(x + " "));
    }
}

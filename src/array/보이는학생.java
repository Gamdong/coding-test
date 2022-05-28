package array;

import java.util.Scanner;

public class 보이는학생 {

    private int solution(int[] students) {

        int std = 0;
        int ans = 0;
        for (int s : students) {
            if (s > std) {
                std = s;
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        보이는학생 T = new 보이는학생();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] students = new int[n];

        for (int i = 0; i < n; i++) {
            students[i] = in.nextInt();
        }

        int ans = T.solution(students);
        System.out.println(ans);
    }
}

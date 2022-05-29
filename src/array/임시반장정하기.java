package array;

import java.util.Scanner;

public class 임시반장정하기 {

    private int solution(int[][] s) {
        int[] ans = new int[s.length];
        int student = 0;
        int max = 0;
        //학생1
        for (int i = 0; i < s.length; i++) {
            int count = 0;
            // 학생2
            for (int j = 0; j < s.length; j++) {

                //반
                for (int z = 0; z < s[i].length; z++) {
                    if (s[i][z] == s[j][z]) {
                        count++;
                        break;
                    }
                }

                if (count > max) {
                    student = i + 1;
                    max = count;
                }
            }
        }
        return student;
    }
    public static void main(String[] args) {
        임시반장정하기 T = new 임시반장정하기();
        Scanner in = new Scanner(System.in);

        int cnt = in.nextInt();
        int[][] input = new int[cnt][5];
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                input[i][j] = in.nextInt();
            }
        }
        int ans = T.solution(input);
        System.out.println(ans);
    }
}

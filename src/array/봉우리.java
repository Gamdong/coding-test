package array;

import java.util.Scanner;

public class 봉우리 {
    private int solution(int[][] arr) {
        int count = 0;
        int[][] map = new int[arr.length + 2][arr.length + 2];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                map[i+1][j+1] = arr[i][j];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int nI = i + 1;
                int nJ = j + 1;

                int curr = map[nI][nJ];
                int l = map[nI][nJ-1];
                int r = map[nI][nJ+1];
                int t = map[nI-1][nJ];
                int b = map[nI+1][nJ];

                if (curr > l && curr > r && curr > t && curr > b) count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        봉우리 T = new 봉우리();
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        int[][] box = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) box[i][j] = in.nextInt();
        }
        int count = T.solution(box);
        System.out.println(count);
    }
}

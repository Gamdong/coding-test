package sortingsearching;

import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;
//class Point implements Comparable<Point> {
//    public int x, y;
//    Point(int x, int y) {
//        this.x = x;
//        this.y = y;
//    }
//
//    @Override
//    public int compareTo(Point o) {
//        if (this.x == o.x) return this.y - o.y;
//    }
//}
public class 좌표정렬 {

    public int[][] solution(int[][] arr) {
        // x 축 정렬
        int n = arr.length;
        int target = 0;
        int t = 0;
        int b = t + 1;
        while (b < n) {

            if (arr[t][0] > arr[b][0]) {
                int[] tmp = arr[t];
                arr[t] = arr[b];
                arr[b] = tmp;
                int nT = 0;
                int nB = nT + 1;
                while (nB <= b) {
                    // x 가 작은지
                    if (arr[nT][0] > arr[nB][0]) {
                        int[] nTmp = arr[nT];
                        arr[nT] = arr[nB];
                        arr[nB] = nTmp;
                        nT = 0;
                        nB = nT + 1;
                    }
                    else if (arr[nT][0] == arr[nB][0]) {
                        //y 비교
                        if (arr[nT][1] > arr[nB][1]) {
                            int[] nTmp = arr[nT];
                            arr[nT] = arr[nB];
                            arr[nB] = nTmp;
                            nT = 0;
                            nB = nT + 1;
                        }
                        else {
                            nT++;
                            nB++;
                        }
                    }
                    else {
                        // 위가 작으면 Pass
                        nB ++;
                        nT ++;
                    }
                }
            }
            else if (arr[t][0] == arr[b][0]) {
                //y 비교
                if (arr[t][1] > arr[b][1]) {
                    int[] nTmp = arr[t];
                    arr[t] = arr[b];
                    arr[b] = nTmp;
                    t = 0;
                    b = t + 1;
                }
                else {
                    t++;
                    b++;
                }
            }
            else {
                t++;
                b++;
            }
        }

        return arr;
    }

    public static void main (String[] args) {
        좌표정렬 T = new 좌표정렬();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = in.nextInt();
            arr[i][1] = in.nextInt();
        }
        int[][] ans = T.solution(arr);
        for (int[] x : ans) System.out.println(x[0] + " " + x[1]);
    }
}

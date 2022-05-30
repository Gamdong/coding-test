package twopointer;
import java.util.Scanner;
public class 최대길이연속부분수열 {

    private int solution(int size, int c, int[] arr) {
        int ans = 0;
        int changed = 0;

        int[] tmp = new int[size];
        for (int i = 0; i < size; i++) tmp[i] = arr[i];

        for (int i = 0; i < size; i++) {
            int curr = arr[i];
            if (curr == 1) continue;

            if (curr == 0 && changed < c) {
                arr[i] = 1;
                changed++;
            }

            if (changed == c) {

                int cnt = 0;
                // 연속된 1 길이 구하기
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] == 0){
                        if (cnt > ans) ans = cnt;
                        cnt = 0;
                    }
                    else cnt++;
                }
                if (cnt > ans) ans = cnt;

                changed = 0;
                arr = tmp;
            }
        }
        return ans;
    }
    private int solution2(int size, int c, int[] arr) {

        int lt = 0; int ans = 0; int cnt = 0;
        for (int rt = 0; rt < size; rt++) {
            if (arr[rt] == 0) cnt++;
            while(cnt > c) {
                if (arr[lt] == 0) cnt --;
                lt++;
            }
            ans = Math.max(ans, rt - lt + 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        최대길이연속부분수열 T = new 최대길이연속부분수열();
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        int c = in.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) arr[i] = in.nextInt();

        int ans = T.solution2(size, c, arr);
        System.out.println(ans);
    }
}

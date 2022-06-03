package sortingsearching;

import java.util.Scanner;

public class LRU {
    private int[] solution(int cacheSize, int[] p) {
        int[] cache = new int[cacheSize];

        for (int i = 0; i < p.length; i++) {
            int work = p[i];
            int target = 0;
            boolean isChanged = false;
            while (target < cacheSize) {
                if (cache[target] ==  0 || work == cache[target]) {
                    // target -> 0
                    for (int j = target; j > 0; j--) {
                        cache[j] = cache[j-1];
                    }
                    cache[0] = work;
                    isChanged = true;
                    break;
                }
                else {
                    target++;
                }
            }
            if (!isChanged) {
                for (int j = cacheSize - 1; j > 0; j--) cache[j] = cache[j-1];
                cache[0] = work;
            }
        }
        return cache;
    }
    public static void main (String[] args) {
        LRU T = new LRU();
        Scanner in = new Scanner(System.in);

        int s = in.nextInt();
        int pSize = in.nextInt();
        int[] p = new int[pSize];
        for (int i = 0; i < pSize; i++) p[i] = in.nextInt();

        int[] ans = T.solution(s, p);
        for (int x : ans) System.out.print(x + " ");
    }
}

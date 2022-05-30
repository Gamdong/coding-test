package hash;

import java.util.HashMap;
import java.util.Scanner;

public class 모든아나그램찾기 {

    private int solution(String s1, String s2) {
        int ans = 0;

        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> sm = new HashMap<>();
        for (char x : s2.toCharArray()) sm.put(x, sm.getOrDefault(x, 0) + 1);

        int lt = 0;
        int k = s2.length();
        for (int rt = 0; rt < s1.length(); rt++) {
            char curr = s1.charAt(rt);
            map.put(curr, map.getOrDefault(curr, 0) + 1);
            if ((rt - lt) == k - 1) {
                //key
                if (sm.equals(map)) ans++;
                char ltv = s1.charAt(lt);
                map.put(ltv, map.get(ltv) - 1);
                if (map.get(ltv) == 0) map.remove(ltv);
                lt++;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        모든아나그램찾기 T = new 모든아나그램찾기();
        Scanner in = new Scanner(System.in);

        String str1 = in.next();
        String str2 = in.next();

        int ans = T.solution(str1, str2);
        System.out.println(ans);
    }
}

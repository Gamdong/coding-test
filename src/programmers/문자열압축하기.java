package programmers;

import java.util.ArrayList;
import java.util.Scanner;

public class 문자열압축하기 {
    private int solution(String s) {
        int answer = s.length();

        for (int i = 1; i < (s.length() / 2) + 1; i++) {
                                                            // i : 글자 수 단위
            int lt = 0;
            int rt = i;                                     // right index
            int sum = 0;                                    // 중복된 수
            String tmpStr = s.substring(lt, rt);            // 기준 문자열
            StringBuilder sb = new StringBuilder();         // 압축 문자열 저장용 SB
            while (lt < s.length()) {
                String nextStr = s.substring(lt, rt);
                if (tmpStr.equals(nextStr)) sum++;
                else {
                    sb.append( (sum != 1) ? sum + tmpStr : tmpStr);     // 이전 문자열 압축결과 저장
                    tmpStr = nextStr;                                   // 초기화
                    sum = 1;
                }
                lt = rt;
                rt = ( rt + i > s.length()) ? s.length() : (rt + i);    // 문자열 길이 이내 끝점 인덱스 범위 설정
            }
            sb.append((sum != 1) ? sum + tmpStr : tmpStr);
            answer = (sb.toString().length() < answer) ? sb.length() : answer;
        }
        return answer;
    }
    public static void main(String[] args) {
        문자열압축하기 T = new 문자열압축하기();
        Scanner in = new Scanner(System.in);
        String input = in.next();

        int ans = T.solution(input);
        System.out.println(ans);
    }
}

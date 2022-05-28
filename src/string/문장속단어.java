package string;

import java.util.Scanner;

public class 문장속단어 {

    public String solution(String sentence) {
        String ans = "";
        String[] words = sentence.split(" ");
        for (String x : words) {
            ans = (x.length() > ans.length()) ? x : ans;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String sentence = in.nextLine();

        문장속단어 T = new 문장속단어();
        String ans = T.solution(sentence);
        System.out.println(ans);
    }
}

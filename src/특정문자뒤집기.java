import java.util.Scanner;

public class 특정문자뒤집기 {
    private String solution(String str) {
        char[] arrChar = str.toCharArray();
        int rightIdx = arrChar.length - 1;
        for (int i = 0; i < rightIdx; i++) {
            char x = arrChar[i];
            if (!Character.isAlphabetic(x)) continue;
            if (Character.isAlphabetic(arrChar[rightIdx])) {
                char tmp = arrChar[i];
                arrChar[i] = arrChar[rightIdx];
                arrChar[rightIdx] = tmp;
            }
            else {
                do {
                    rightIdx--;
                }
                while (!Character.isAlphabetic(arrChar[rightIdx]));
                char tmp = arrChar[i];
                arrChar[i] = arrChar[rightIdx];
                arrChar[rightIdx] = tmp;
            }
            rightIdx--;
        }

        String ans = "";
        for (char x : arrChar) ans += x;
        return ans;
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String input = in.next();

        특정문자뒤집기 T = new 특정문자뒤집기();
        System.out.println(T.solution(input));
    }
}

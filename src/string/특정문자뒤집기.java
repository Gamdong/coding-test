package string;

import java.util.Scanner;

public class 특정문자뒤집기 {
    private String solution(String str) {
        char[] arrChar = str.toCharArray();
        int left = 0;
        int right = arrChar.length - 1;

        while (left < right) {

            if (!Character.isAlphabetic(arrChar[left])) left++;
            else if (!Character.isAlphabetic(arrChar[right])) right--;
            else {
                char tmp = arrChar[left];
                arrChar[left] = arrChar[right];
                arrChar[right] = tmp;
                left++;
                right--;
            }
        }
        return String.valueOf(arrChar);
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String input = in.next();

        특정문자뒤집기 T = new 특정문자뒤집기();
        System.out.println(T.solution(input));
    }
}

package string;

import java.util.Scanner;

class 문자열찾기 {

    public int solution(String str, char t) {
        int found = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);
        for (char x : str.toCharArray()) {
            if (x == t) found++;
        }
        return found;
    }

    public static void main(String[] args){
        문자열찾기 T = new 문자열찾기();
        Scanner in = new Scanner(System.in);
        String input = in.next();
        char word = in.next().charAt(0);

        int found = T.solution(input, word);
        System.out.println(found);
    }
}

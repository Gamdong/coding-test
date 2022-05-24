import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class 중복문자제거 {

    public String solution(String input) {

        char[] chars = input.toCharArray();
        List<Character> arr = new ArrayList<Character>();
        for (char x : input.toCharArray()) {
            arr.add(x);
        }
        List<Character> ansList = arr.stream().distinct().collect(Collectors.toList());
        StringBuilder sb = new StringBuilder();
        ansList.forEach(x -> {
            sb.append(x);
        });
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.next();

        중복문자제거 T = new 중복문자제거();
        String answer = T.solution(input);
        System.out.println(answer);
    }
}

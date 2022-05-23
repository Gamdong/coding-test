import java.util.ArrayList;
import java.util.Scanner;
public class 단어뒤집기 {

    private ArrayList<String> solution(ArrayList<String> arr) {
        ArrayList<String> ans = new ArrayList<>();
        arr.forEach(x -> {
            String reversed = new StringBuilder(x).reverse().toString();
            ans.add(reversed);
        });
        return ans;
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int inputCount = in.nextInt();
        ArrayList<String> arrStr = new ArrayList<>();

        do {
            String word = in.next();
            arrStr.add(word);
        }
        while (arrStr.size() < inputCount);

        단어뒤집기 T = new 단어뒤집기();
        ArrayList<String> reversed = T.solution(arrStr);
        reversed.forEach(x -> System.out.println(x));
    }
}

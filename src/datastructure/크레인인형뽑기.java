package datastructure;

import java.util.Scanner;
import java.util.Stack;

public class 크레인인형뽑기 {

    private int solution(int n, int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();               // 뽑은 인형 Stack

        for (int i = 0; i < moves.length; i ++) {           // 움직인다 -> 뽑는다.
            int position = moves[i] - 1;                    // 뽑을 인형 위치
            for (int j = 0; j < board.length; j++) {        // 위에서 아래로 움직인다.
                int curr = board[j][position];
                if (curr == 0) continue;
                if (!stack.isEmpty() && stack.peek() == curr) {
                    stack.pop();          // 인형을 꺼낸다.
                    answer += 2;
                }
                else {
                    stack.push(curr);     // 인형을 담는다.
                }
                board[j][position] = 0;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        크레인인형뽑기 T = new 크레인인형뽑기();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[][] board = new int[n][n];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = in.nextInt();
            }
        }
        int m = in.nextInt();
        int[] moves = new int[m];
        for (int i = 0; i < m; i++ ) moves[i] = in.nextInt();

        int ans = T.solution(n, board, moves);
        System.out.println(ans);
    }
}

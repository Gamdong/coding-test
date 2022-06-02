package datastructure;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Person {
    public int id;
    public int priority;

    public Person(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }
}
public class 응급실 {
    private int solution(int[] arr, int m) {
        int ans = 1;
        Queue<Person> q = new LinkedList<>();
        int nIdx = 0;
        for (int i = 0; i < arr.length; i++) q.offer(new Person(i, arr[i]));

        while(!q.isEmpty()) {
            Person curr = q.poll();
            int maxLevel = 0;
            for (int i = 0; i < q.size(); i++) {
                Person tmpPerson = q.poll();
                if (maxLevel < tmpPerson.priority ) maxLevel = tmpPerson.priority;
                q.offer(tmpPerson);
            }

            if (curr.priority >= maxLevel) {
                if (curr.id == m) {
                    return ans;
                } else {
                    ans++;
                }
            }
            else {
                q.offer(curr);
            }
        }
        return ans;
    }
    public static void main (String[] args) {
        응급실 T = new 응급실();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) arr[i] = in.nextInt();
        int ans = T.solution(arr, m);
        System.out.println(ans);
    }
}

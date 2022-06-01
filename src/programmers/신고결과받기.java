package programmers;

import java.util.ArrayList;
import java.util.HashMap;

public class 신고결과받기 {
    private int[] solution(String[] id_list, String[] report, int k) {

        int[] answer = new int[id_list.length];
        HashMap<String, ArrayList<String>> reporterMap = new HashMap<>();

        for (String r : report) {
            String[] contents = r.split(" ");
            String reporter = contents[0];
            String attacker = contents[1];

            ArrayList<String> rpts = reporterMap.getOrDefault(attacker, new ArrayList<String>());
            boolean isSaved = false;
            for (String x : rpts) {
                if (x.equals(reporter)) {
                    isSaved = true;
                    break;
                };
            }

            if (isSaved) continue;
            rpts.add(reporter);
            reporterMap.put(attacker, rpts);
        }

        for (String id : reporterMap.keySet()) {
            ArrayList<String> reporters = reporterMap.get(id);
            if (reporters.size() >= k) {
                for (String reporterId: reporters) {
                    for (int i = 0; i < id_list.length; i++) {
                        if (id_list[i].equals(reporterId)) answer[i]++;
                    }
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        신고결과받기 T = new 신고결과받기();
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;
        int[] ans = T.solution(id_list, report, k);
        for (int x : ans)System.out.print(x + " ");
    }
}


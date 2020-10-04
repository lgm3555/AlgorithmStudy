package week10;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;
import java.util.Map;
import java.util.List;

public class FailureRate {
    public int[] solution(int N, int[] stages) {
        int[] answer = {};

        Map<Integer, Double> mapList = new HashMap<Integer, Double>();
        for (int i=1; i<=N+1; i++) {
            int tmpInt = 0;
            double totalPlayerNum = stages.length;
            for (int j=0; j<stages.length; j++) {
                if (i == stages[j]) {
                    tmpInt++;
                }
            }
            mapList.put(i, tmpInt / totalPlayerNum);
        }

        List<Integer> keyList = new ArrayList<Integer>(mapList.keySet());
        Collections.sort(keyList, ((o1, o2) -> mapList.get(o2).compareTo(mapList.get(o1))));
        answer = new int[keyList.size()];

        for (int i=0; i<keyList.size(); i++) {
            answer[i] = keyList.get(i);
        }

        return answer;
    }
}

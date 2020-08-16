import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;
class Solution7 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> mapParticipant = new HashMap<String, Integer>();
        for (String participantName : participant) {
            mapParticipant.put(participantName, mapParticipant.getOrDefault(participantName, 0) + 1);
        }
        for (String completionName : completion) {
            mapParticipant.put(completionName, mapParticipant.getOrDefault(completionName, 0) - 1);
        }

        Iterator<Map.Entry<String, Integer>> iterMapValue = mapParticipant.entrySet().iterator();
        while(iterMapValue.hasNext()) {
            Map.Entry<String, Integer> mapValue = iterMapValue.next();
            if (0 != mapValue.getValue()) {
                answer = mapValue.getKey();
            }
        }
        return answer;
    }
}
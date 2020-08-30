import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class Solution3 {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};

        List<String> list = new LinkedList<>();
        for (int i=0; i<strings.length; i++) {
            list.add(strings[i].charAt(n) + strings[i]);
        }

        Collections.sort(list);

        answer = new String[list.size()];

        for (int i=0; i<list.size(); i++) {
            answer[i] = list.get(i).substring(1, list.get(i).length());
        }

        return answer;
    }
}

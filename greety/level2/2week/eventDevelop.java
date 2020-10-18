package level2week2;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class eventDevelop {
    public int[] solution(int[] progresses, int[] speeds) {
        List<int[]> queue = new LinkedList<>();
        for (int i = 0; i < progresses.length; i++) {
            queue.add(new int[] { progresses[i], speeds[i] });
        }

        List<Integer> result = new ArrayList<>();
        while (queue.size() > 0) {

            for (int[] arr : queue) {
                arr[0] += arr[1];
            }

            if (queue.get(0)[0] >= 100) {

                int count = 0;
                for (int i = 0; i < queue.size();) {

                    if (queue.get(i)[0] >= 100) {
                        queue.remove(i);
                        count++;
                    } else {
                        break;
                    }
                }
                result.add(count);
            }
        }

        int[] answer = new int[result.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }
}

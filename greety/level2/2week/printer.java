package level2week2;
import java.util.*;
public class printer {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Integer> priortyQueue = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : priorities){
            priortyQueue.add(i);
        }
        while (!priortyQueue.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (priorities[i] == priortyQueue.peek()) {
                    if (i == location) {
                        return ++answer;
                    }
                    priortyQueue.poll();
                    ++answer;
                }
            }
        }
        return answer;
    }
}

import java.util.ArrayList;
import java.util.Arrays;
public class Solution2 {
    public static int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<Integer>();
        Arrays.sort(arr);
        for (int i : arr) {
            if (0 == i % divisor) {
                list.add(i);
            }
        }
        if (list.size() == 0) {
            list.add(-1);
        }
        answer = new int[list.size()];
        for (int i=0; i< answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}

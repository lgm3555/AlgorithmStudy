import java.util.ArrayList;

public class Solution {
    public static int[] solution(int []arr) {
        int[] answer = {};
        int tmp = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i : arr) {
            if (tmp != i) {
                list.add(i);
                tmp = i;
            }
        }

        answer = new int[list.size()];

        for (int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}

package level1;

import java.util.ArrayList;

class Solution {
	public int[] solution(int[] arr) {
    	int[] answer = {};

        ArrayList<Integer> numList = new ArrayList<Integer>();
        for (int i : arr) {
            numList.add(i);
        }

        int min = 0;
        int position = 0;
        if (1 < numList.size()) {
            for (int i = 0; i < numList.size(); i++) {
                if (0 == i) {
                    min = numList.get(i);
                }
                if (min > numList.get(i)) {
                    min = numList.get(i);
                    position = i;
                }
            }
            numList.remove(position);
        } else if (1 == numList.size()) {
            numList.remove(0);
            numList.add(-1);
        }

        answer = new int[numList.size()];
        int count = 0;
        for (int i : numList) {
            answer[count] = i;
            count++;
        }

        return answer;
    }
}
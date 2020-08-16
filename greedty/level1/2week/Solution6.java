import java.util.LinkedList;
class Solution6 {
    public int[] solution(int[] answers) {
        int[] pointCheck = new int[3];
        int[] surrender1 = {1, 2, 3, 4, 5};
        int[] surrender2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] surrender3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5,};

        for (int i=0; i<answers.length; i++) {
            if (answers[i] == surrender1[i%5]) {
                ++pointCheck[0];
            }
            if (answers[i] == surrender2[i%8]) {
                ++pointCheck[1];
            }
            if (answers[i] == surrender3[i%10]) {
                ++pointCheck[2];
            }
        }
        LinkedList<Integer> list = new LinkedList<Integer>();
        int max = 0;
        for (int i = 0; i < 3; ++i) {
            if (pointCheck[i] > max) {
                list = new LinkedList<Integer>();
                list.add(i + 1);
                max = pointCheck[i];
            } else if (pointCheck[i] == max) {
                list.add(i + 1);
            }
        }
        int[] reserve = new int[list.size()];
        for (int i = 0; i < reserve.length; ++i) {
            reserve[i] = list.get(i);
        }
        return reserve;
    }
}
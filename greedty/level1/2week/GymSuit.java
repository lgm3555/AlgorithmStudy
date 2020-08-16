import java.util.HashSet;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n;
        HashSet<Integer> reservedList = new HashSet<>();
        HashSet<Integer> lostList = new HashSet<>();

        for (int i=0; i<reserve.length; i++) {
            reservedList.add(reserve[i]);
        }
        for (int i=0; i<lost.length; i++) {
            if(reservedList.contains(lost[i])) {
                reservedList.remove(lost[i]);
            } else {
                lostList.add(lost[i]);
            }
        }
        for (int i=0; i<lost.length; i++) {
            if(lostList.contains(lost[i])) {
                if(reservedList.contains(lost[i]-1)) {
                    reservedList.remove(lost[i] - 1);
                } else if(reservedList.contains(lost[i]+1)) {
                    reservedList.remove(lost[i] + 1);
                } else {
                    answer = answer - 1;
                }
            }
        }
        return answer;
    }
}

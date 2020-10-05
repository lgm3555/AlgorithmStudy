package week9;
import java.util.ArrayList;

public class RuleOfXNumber {
    public long[] solution(int x, int n) {
        long[] answer = {};

        ArrayList<Long> longList = new ArrayList<Long>();

        int count = 0;
        long tmp = 0;
        while (n != count) {
            tmp = tmp + x;
            longList.add(tmp);
            count++;
        }
        answer = new long[longList.size()];
        for (int i=0; i<longList.size(); i++) {
            answer[i] = longList.get(i);
        }
        return answer;
    }
}

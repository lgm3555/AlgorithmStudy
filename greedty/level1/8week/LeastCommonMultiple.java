package week8;

public class LeastCommonMultiple {
    public int[] solution(int n, int m) {
        int length = 0;
        if (n > m) {
            length = n;
        } else {
            length = m;
        }
        int minShareNum = 0;
        for (int i=1; i<=length; i++) {
            if (0 == n % i && 0 == m % i) {
                minShareNum = i;
            }
        }
        int maxShareNum = (n / minShareNum) * (m / minShareNum) * minShareNum;
        int[] answer = {minShareNum, maxShareNum};
        return answer;
    }
}

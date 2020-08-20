public class Solution {
    public static long solution(int a, int b) {
        long answer = 0;
        if (a < b) {
            answer = a;
            while (a != b) {
                if (a != b) {
                    long tmp = 0;
                    tmp = answer;
                    answer = a + 1;
                    answer = answer + tmp;
                }
                a++;
            }
        } else if (a == b){
            answer = a;
        } else {
            answer = b;
            while (a != b) {
                if (a != b) {
                    long tmp = 0;
                    tmp = answer;
                    answer = b + 1;
                    answer = answer + tmp;
                }
                b++;
            }
        }
        return answer;
    }
}

package level1;

class Solution1 {
    public int solution(int n) {
        int answer = 0;
        
        for (int i=1; i<=n; i++) {
            if (0 == n%i) {
                answer = answer + i;
            }
        }
        
        return answer;
    }
}
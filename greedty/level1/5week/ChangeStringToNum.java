public class Solution {
    public int solution(String s) {
        int answer = 0;
        if (1 <= s.length() && 5 >= s.length()) {
            answer = Integer.parseInt(s);
        }
        return answer;
    }
}

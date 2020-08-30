public class Solution {
    public String solution(String answer) {
        String testAnswer = "";
        if (0 == (answer.length() % 2)) {
            testAnswer = answer.substring(answer.length() / 2 - 1, answer.length() / 2 + 1);
        } else {
            testAnswer = answer.substring(answer.length() / 2, answer.length() / 2 + 1);
        }
        return testAnswer;
    }
}

package level2week1;

public class country124 {
    public String solution(int n) {
        String answer = new String("");
        int addNum = 0;
        while (n != 0) {
            addNum = n%3 == 0 ? 4 : n%3;
            answer = Integer.toString(addNum) + answer;
            n = addNum == 4 ? n/3 - 1 : n/3;
        }

        return answer;
    }
}

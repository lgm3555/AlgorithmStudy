import java.util.ArrayList;
import java.util.Collections;

class Solution2 {
    public static String solution(String s) {
        String answer = "";
        char[] charList = s.toCharArray();
        ArrayList<Character> upperCharList = new ArrayList<Character>();
        ArrayList<Character> lowerCharList = new ArrayList<Character>();
        for (char c : charList) {
            if (Character.isUpperCase(c)) {
                upperCharList.add(c);
            } else {
                lowerCharList.add(c);
            }
        }

        Collections.sort(upperCharList, Collections.reverseOrder());
        Collections.sort(lowerCharList, Collections.reverseOrder());

        for (Character c : lowerCharList) {
            answer += c;
        }
        for (Character c : upperCharList) {
            answer += c;
        }
        return answer;
    }
}
public class Solution {
    public static boolean solution(String s) {

        boolean answer = true;
        int pCount = 0;
        int yCount = 0;
        char c;

        for (int i=0; i<s.length(); i++) {
            c = Character.toLowerCase(s.charAt(i));
            if ('p' == c) {
                pCount++;
            } else if ('y' == c) {
                yCount++;
            }
        }

        if (pCount != yCount) {
            answer = false;
        }

        return answer;
    }
}

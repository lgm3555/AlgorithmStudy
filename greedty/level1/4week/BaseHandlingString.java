class Solution {
    public static boolean solution(String s) {
        if (4 == s.length() || 6 == s.length()) {
            return s.matches("^[0-9]*$");
        } else {
            return false;
        }
    }
}

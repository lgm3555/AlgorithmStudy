package level1;

class Solution2 {
    public String solution(String s) {
        String answer = "";
        int tmp = 0;
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<s.length(); i++) {
            if(' ' == s.charAt(i)) {
                sb.append(' ');
                tmp = 0;
            } else {
                if(tmp % 2 != 0) {
                    sb.append(Character.toLowerCase(s.charAt(i)));
                    tmp++;
                } else {
                    sb.append(Character.toUpperCase(s.charAt(i)));
                    tmp++;
                }
            }
        }
        return sb.toString();
    }
}
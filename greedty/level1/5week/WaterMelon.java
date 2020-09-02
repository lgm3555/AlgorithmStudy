class Solution {
    public String solution(int n) {

        StringBuilder sb = new StringBuilder();

        for (int i=0; i<n; i++) {
            if (0 == i%2) {
                sb.append("수");
            } else {
                sb.append("박");
            }
        }

        return sb.toString();
    }
}

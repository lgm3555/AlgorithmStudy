package week10;

public class Secretmap {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for (int i=0; i<n; i++) {
            StringBuilder sb = new StringBuilder(new String(Integer.toBinaryString(arr1[i] | arr2[i])));
            if (n != sb.length()) {
                while (n != sb.length()) {
                    sb.insert(0, "0");
                }
            }
            answer[i] = sb.toString().replace('1','#').replace('0',' ');
        }
        return answer;
    }
}

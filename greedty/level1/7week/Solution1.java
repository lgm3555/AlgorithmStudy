package level1;
import java.util.Arrays;

class Solution1 {
	public long solution(long n) {
        String str = "" + n;
        char[] sol = str.toCharArray();
        Arrays.sort(sol);
        str = new StringBuilder(new String(sol)).reverse().toString();

        return Long.parseLong(str);
    }
}
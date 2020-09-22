package level1;

class Solution2 {
    public long solution(long n) {
    	double tmpNum = Math.sqrt(n);
        if (Math.floor(tmpNum) == tmpNum) {
            return (long)(Math.pow(tmpNum + 1, 2));
        } else {
            return -1;
        }
    }
}
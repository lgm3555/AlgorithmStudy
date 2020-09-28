package week8;

public class Collatsu {
    public int solution(int num) {
        long n = (long)num;
        for (int i =0; i<500; i++) {
            if (1 == n) {
                return i;
            } else {
                n = (0 == n % 2) ? n / 2 : (n * 3) + 1;
            }
        }
        return -1;
    }
}

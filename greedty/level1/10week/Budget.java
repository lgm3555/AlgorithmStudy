package week10;
import java.util.Arrays;

public class Budget {
    public int solution(int[] arr, int budget) {
        Arrays.sort(arr);
        int count = 0 ;
        for (int i : arr) {
            budget = budget - i;
            if (budget < 0) {
                budget = budget + i;
            } else {
                count++;
            }
        }
        return count;
    }
}

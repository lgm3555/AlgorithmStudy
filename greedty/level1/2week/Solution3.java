import java.time.LocalDate;
class Solution3 {
    public String solution(int a, int b) {
        LocalDate localDate = LocalDate.of(2016, a, b);
        String answer = localDate.getDayOfWeek().name();
        return answer.substring(0,3);
    }
}
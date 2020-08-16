package algorithm.level1.lgm3555;

public class CodingTest4 {
	public static void main(String[] args) {
		int[] lost = { 2,3,4 };
		int[] reserve = { 1,3,5 };

		solution(5, lost, reserve);
	}

	/**
	 * 체육복 Solution (https://programmers.co.kr/learn/courses/30/lessons/42862)
	 * 
	 * @param n 학생 인원
	 * @param lost 잃어버린 학생 번호 
	 * @param reserve 빌려줄수 있는 학생 번호 
	 * @return
	 */
	public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        if (lost.length != reserve.length) {
            for (int i = 0; i < reserve.length; i++) {
                for (int j = 0; j < lost.length; j++) {
                    if (lost[j] != 0) {
                        if ((reserve[i] == lost[j] + 1) || (reserve[i] == lost[j] - 1)) {
                            lost[j] = 0;
                            answer++;
                            break;
                        }
                    }
                }
            }
            
            answer = answer + n - lost.length;
        } else {
            answer = n; 
        }
		
        return answer;
    }
}

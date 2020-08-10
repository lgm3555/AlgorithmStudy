package algorithm.level1.lgm3555;

import java.util.Arrays;

public class CodingTest2 {
	public static void main(String[] args) {
		String[] participant = { "mislav", "stanko", "mislav", "ana", "tests" };
		String[] completion = { "stanko", "ana", "mislav" };

		System.out.println(solution(participant, completion));
	}

	/**
	 * 크레인 인형뽑기 Solution (https://programmers.co.kr/learn/courses/30/lessons/64061)
	 * 
	 * @param board 인형이 담아져있는 2차원 배열
	 * @param moves 크레인이 작동한 위치가 담긴 배열
	 * @return 터트려진 인형의 개수
	 */
	public static String solution(String[] participant, String[] completion) {
		Arrays.sort(participant);
		Arrays.sort(completion);

		for (int i = 0; i < completion.length; i++) {
			if (!participant[i].equalsIgnoreCase(completion[i])) {
				return participant[i];
			}
		}
		return participant[participant.length - 1];
	}
}

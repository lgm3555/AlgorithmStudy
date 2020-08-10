package algorithm.level1.lgm3555;

import java.util.Arrays;

public class CodingTest2 {
	public static void main(String[] args) {
		String[] participant = { "mislav", "stanko", "mislav", "ana", "tests" };
		String[] completion = { "stanko", "ana", "mislav" };

		System.out.println(solution(participant, completion));
	}

	/**
	 * ũ���� �����̱� Solution (https://programmers.co.kr/learn/courses/30/lessons/64061)
	 * 
	 * @param board ������ ������ִ� 2���� �迭
	 * @param moves ũ������ �۵��� ��ġ�� ��� �迭
	 * @return ��Ʈ���� ������ ����
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

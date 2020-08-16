package algorithm.level1.lgm3555;

import java.util.Arrays;

public class CodingTest3 {
	public static void main(String[] args) {
		int[] answers = { 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1 };

		System.out.println(solution(answers));
	}

	/**
	 * 모의고사 Solution (https://programmers.co.kr/learn/courses/30/lessons/42840)
	 * 
	 * @param answers 문제 답
	 * @return 높은 점수를 받은 사람을 오름차순하여 반환
	 */
	public static int[] solution(int[] answers) {
		int[] answer = new int[3];

		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] c = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };

		int aCount = 0;
		int bCount = 0;
		int cCount = 0;

		int aTemp = 5;
		int bTemp = 7;
		int cTemp = 9;

		for (int i = 0; i < answers.length; i++) {
			if (i > 4) {

				if (i % aTemp == 0 && aTemp != i) {
					aTemp = aTemp * 2;

				}

				if (answers[i] == a[i - aTemp]) {
					aCount++;
				}
			} else {
				if (answers[i] == a[i]) {
					aCount++;
				}
			}
		}

		for (int i = 0; i < answers.length; i++) {
			if (i > 7) {

				if (i % bTemp == 0 && bTemp != i) {
					bTemp = bTemp * 2;

				}

				if (answers[i] == b[i - bTemp]) {
					bCount++;
				}
			} else {
				if (answers[i] == b[i]) {
					bCount++;
				}
			}
		}

		for (int i = 0; i < answers.length; i++) {
			if (i > 9) {

				if (i % cTemp == 0 && cTemp != i) {
					cTemp = cTemp * 2;

				}

				if (answers[i] == c[i - cTemp]) {
					cCount++;
				}
			} else {
				if (answers[i] == c[i]) {
					cCount++;
				}
			}
		}

		int temp = cCount > ((aCount > bCount) ? aCount : bCount) ? cCount : ((aCount > bCount) ? aCount : bCount);

		if (aCount > bCount) {
			if (bCount > cCount) {
				answer[0] = 1;
			} else {
				if (aCount > cCount) {
					answer[0] = 1;
				}
			}
		} else if (aCount < bCount) {

		} else {
			if (aCount == cCount) {
				answer[0] = 1;
				answer[1] = 2;
				answer[2] = 3;
			} else {
				answer[0] = 3;
			}
		}

		return answer;
	}
}

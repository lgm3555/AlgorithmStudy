package algorithm.level1.lgm3555;

import java.util.ArrayList;

public class CodingTest1 {
	public static void main(String[] args) {
		int[][] board = { { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 3 }, { 0, 2, 5, 0, 1 }, { 4, 2, 4, 4, 2 },{ 3, 5, 1, 3, 1 } };
		int[] moves = { 1, 5, 3, 5, 1, 2, 1, 4 };

		System.out.println(solution(board, moves));
	}

	/**
	 * ũ���� �����̱� Solution (https://programmers.co.kr/learn/courses/30/lessons/64061)
	 * 
	 * @param board ������ ������ִ� 2���� �迭
	 * @param moves ũ������ �۵��� ��ġ�� ��� �迭
	 * @return ��Ʈ���� ������ ����
	 */
	public static int solution(int[][] board, int[] moves) {
		int answer = 0;
		ArrayList<Integer> arr = new ArrayList<Integer>();

		for (int i = 0; i < moves.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if (board[j][moves[i] - 1] != 0) {
					arr.add(board[j][moves[i] - 1]);
					board[j][moves[i] - 1] = 0;
					break;
				}

			}
		}

		for (int k = 0; k < arr.size() - 1; k++) {
			if (arr.get(k) == arr.get(k + 1)) {
				answer = answer + 2;
				arr.remove(k);
				arr.remove(k);
				k = -1;
			}
		}

		return answer;
	}
}

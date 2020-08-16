import java.util.ArrayList;

class Solution2 {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        ArrayList<Integer> arr = new ArrayList<Integer>();

        for (int i=0; i<moves.length; i++) {
            for (int j=0; j<board.length; j++) {
                if (board[j][moves[i] - 1] != 0) {
                    arr.add(board[j][moves[i] - 1]);
                    board[j][moves[i] - 1] = 0;
                    break;
                }
            }
        }

        for (int k=0; k<arr.size()-1; k++) {
            if (arr.get(k) == arr.get(k+1)) {
                answer = answer + 2;
                arr.remove(k);
                arr.remove(k);
                k = -1;
            }
        }

        return answer;
    }
}
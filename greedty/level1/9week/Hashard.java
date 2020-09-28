package week9;

public class Hashard {
    public boolean solution(int x) {
        boolean answer = true;
        int tmp = 0;
        int positionSum = 0;
        int originalX = x;
        while (true) {
            tmp = x % 10;
            x = x / 10;
            positionSum = positionSum + tmp;
            if (0 == x / 10) {
                positionSum = positionSum + x;
                break;
            }
        }
        System.out.println(positionSum);
        System.out.println(originalX);
        if (0 == originalX % positionSum) {
            answer = true;
        } else {
            answer = false;
        }

        return answer;
    }
}

package week8;

import java.util.HashMap;
import java.util.Map;
class keypad {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        Map<Integer, String> mapList = new HashMap<Integer, String>();
        int[][] pad = new int[4][3];
        int count = 1;
        for (int i=0; i<4; i++) {
            for (int j=0; j<3; j++) {
                if (10 == count) {
                    mapList.put(count, "" + i + "," + j);
                    count++;
                } else if (11 == count) {
                    mapList.put(0, "" + i + "," + j);
                    count++;
                } else if (12 == count) {
                    mapList.put(count, "" + i + "," + j);
                    break;
                } else {
                    mapList.put(count, "" + i + "," + j);
                    count++;
                }
            }
        }

        int lastPositionLeft = 10;
        int lastPositionRight = 12;
        for (int i : numbers) {
            for (Map.Entry<Integer,String> entry : mapList.entrySet()) {
                if (i == 1 || i == 4 || i == 7) {
                    answer += "L";
                    lastPositionLeft = i;
                    break;
                } else if (i == 3 || i == 6 || i == 9) {
                    answer += "R";
                    lastPositionRight = i;
                    break;
                } else {
                    String next = mapList.get(i);
                    String tmpLeft = mapList.get(lastPositionLeft);
                    String tmpRight = mapList.get(lastPositionRight);
                    int leftAbs1 = Integer.parseInt(next.split(",")[0])
                            - Integer.parseInt(tmpLeft.split(",")[0]);
                    int leftAbs2 = Integer.parseInt(next.split(",")[1])
                            - Integer.parseInt(tmpLeft.split(",")[1]);
                    int rightAbs1 = Integer.parseInt(next.split(",")[0])
                            - Integer.parseInt(tmpRight.split(",")[0]);
                    int rightAbs2 = Integer.parseInt(next.split(",")[1])
                            - Integer.parseInt(tmpRight.split(",")[1]);
                    int leftTotalAbs = Math.abs(leftAbs1) + Math.abs(leftAbs2);
                    int rightTotalAbs = Math.abs(rightAbs1) + Math.abs(rightAbs2);
                    if (leftTotalAbs == rightTotalAbs) {
                        if (hand.equals("right")) {
                            answer += "R";
                            lastPositionRight = i;
                            break;
                        } else {
                            answer += "L";
                            lastPositionLeft = i;
                            break;
                        }
                    } else if (leftTotalAbs > rightTotalAbs) {
                        answer += "R";
                        lastPositionRight = i;
                        break;
                    } else if (leftTotalAbs < rightTotalAbs) {
                        answer += "L";
                        lastPositionLeft = i;
                        break;
                    }
                }
            }
        }
        return answer;
    }
}
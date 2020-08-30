import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class Solution3 {
    public static boolean solution1(String s) {
        if (4 == s.length() || 6 == s.length()) {
            return s.matches("^[0-9]*$");
        } else {
            return false;
        }
    }
}
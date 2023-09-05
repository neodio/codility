package lesson4.missinginteger;

import java.util.HashSet;
import java.util.Set;

public class MissingInteger {
    public int solution(int[] A) {

        if (A.length < 1) {
            return 1;
        }

        Set<Integer> set = new HashSet<>();
        for (int num : A) {
            set.add(num);
        }

        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }

        return -1;
    }
}

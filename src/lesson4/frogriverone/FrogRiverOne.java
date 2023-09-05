package lesson4.frogriverone;

import java.util.HashMap;
import java.util.Map;

public class FrogRiverOne {
    public int solution(int X, int[] A) {
        int answer = -1;
        Map<Integer, Integer> check = new HashMap<>();

        for (int i=1; i<=X; i++) {
            check.put(i, i);
        }

        for (int i=0; i<A.length; i++) {
            if (check.containsKey(A[i])) {
                check.remove(A[i]);
            }

            if (check.isEmpty()) {
                answer = i;
                return answer;
            }
        }

        return answer;
    }
}

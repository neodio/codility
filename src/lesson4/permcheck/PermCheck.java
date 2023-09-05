package lesson4.permcheck;

import java.util.Arrays;

public class PermCheck {
    public int solution(int[] A) {
        Arrays.sort(A);
        for (int i = 0; i < A.length; i++) {
            if (i + 1 != A[i]) {
                return 0;
            }
        }
        return 1;
    }
}

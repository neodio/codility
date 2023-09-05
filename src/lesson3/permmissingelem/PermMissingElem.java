package lesson3.permmissingelem;

import java.util.Arrays;

public class PermMissingElem {
    public int solution(int[] A) {
        Arrays.sort(A);
        for (int i = 0; i < A.length; i++) {
            if (A[i] != i + 1) {
                return i + 1;
            }
        }
        return A.length + 1;  // 마지막 숫자가 빠진 경우를 생각해서 return 0이 아닌 A.length + 1을 한다.
    }
}

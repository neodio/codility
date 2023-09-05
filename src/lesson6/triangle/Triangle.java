package lesson6.triangle;

import java.util.Arrays;

public class Triangle {
    public int solution(int[] A) {
        Arrays.sort(A);//배열의 요소들을 정렬해준다.
        if (3 > A.length) return 0;

        for (int i = 0; i < A.length - 2; i++) {
            if (A[i] + A[i+1] > A[i + 2]) {//인접한 인덱스 3가지를 비교한다.
                return 1; //한가지 경우라도 만족하면 바로 1을 리턴한다.
            }
        }

        return 0;
    }
}

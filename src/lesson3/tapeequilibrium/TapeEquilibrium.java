package lesson3.tapeequilibrium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TapeEquilibrium {
    public int solution(int[] A) {
        List sumList = new ArrayList();

        int left = 0;
        int right;
        int sum = 0;

        for(int i : A) {
            sum += i;
        }

        for(int j = 1 ; j < A.length ; j++){
            left += A[j-1];
            right = sum - left;
            sumList.add(Math.abs(left - right));
        }

        return (int) Collections.min(sumList);
    }
}

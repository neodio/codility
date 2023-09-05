package lesson2.oddoccurrencesinarray;

import java.util.ArrayList;
import java.util.Collections;

public class OddOccurrencesInArray {
    public int solution(int[] A) {
        // Implement your solution here
        int result = 0;
        ArrayList<Integer> intArrayList = new ArrayList<>();
        for (int i : A) {
            intArrayList.add(i);
        }

        for (int i = 0; i < A.length; i++) {
            int aa = Collections.frequency(intArrayList, A[i]);
            if (aa == 1) {
                result = A[i];
            }
        }

        return result;
    }
}

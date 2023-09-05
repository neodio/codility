package lesson6.distinct;

import java.util.HashSet;
import java.util.Set;

public class Distinct {
    public int solution(int[] A) {
        Set<Integer> nums = new HashSet<>();
        for (int a : A) {
            nums.add(a);
        }
        return nums.size();
    }
}

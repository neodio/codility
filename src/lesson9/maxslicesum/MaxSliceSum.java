package lesson9.maxslicesum;

public class MaxSliceSum {
    public int solution(int[] A) {

        int maxEnding = 0;
        int maxSlice = -1000000;
        for (int num : A) {
            maxEnding = Math.max(num, maxEnding + num);
            maxSlice = Math.max(maxSlice, maxEnding);
        }
        return maxSlice;
    }
}

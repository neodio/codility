package lesson2.cyclicrotation;

public class CyclicRotation {
    public int[] solution(int[] A, int K) {
        int[] arr = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            arr[(i + K) % A.length] = A[i];
        }

        return arr;
    }
}

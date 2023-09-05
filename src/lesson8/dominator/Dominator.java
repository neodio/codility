package lesson8.dominator;

public class Dominator {
    public int solution(int[] A) {
        int candidate = -1;
        int answer = -1;
        int val = -1;
        int size = 0;
        int tmpVal = 0;
        int tmpAns = 0;
        int count = 0;

        for (int i = 0; i < A.length; i++) {
            if (size == 0) {
                size++;
                tmpVal = A[i];
                tmpAns = i;
            } else if (tmpVal != A[i]) {
                size--;
            } else {
                size++;
            }
        }

        if (size > 0) {
            candidate = tmpAns;
            val = tmpVal;
        }

        for (int i = 0; i < A.length; i++) {
            if (A[i] == val) {
                count++;
            }
        }

        if (count > A.length / 2) {
            answer = candidate;
        }
        return answer;
    }
}

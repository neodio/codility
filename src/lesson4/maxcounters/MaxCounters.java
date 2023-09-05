package lesson4.maxcounters;

public class MaxCounters {
    public int[] solution(int N, int[] A) {
        int[] counter = new int[N];
        int tmpMaxCounter = 0;
        int doneMaxCounter = 0;
        for (int i = 0; i < A.length; i++) {
            // MAX COUNTER 처리 여부
            if (A[i] > N) {
                // 일단 한 걸로 치고 그 값을 담아둔 뒤
                doneMaxCounter = tmpMaxCounter;
            } else {
                // 연산하기 전에 maxCount를 보고 작으면 maxCount로 세팅 먼저해준다
                if (counter[A[i] - 1] < doneMaxCounter) {
                    counter[A[i] - 1] = doneMaxCounter;
                }
                // 매번 최대값을 저장
                tmpMaxCounter = Math.max(tmpMaxCounter, ++counter[A[i] - 1]);
            }
        }
        if (doneMaxCounter > 0) {
            for (int i = 0; i < counter.length; i++) {
                // doneMaxCounter보다 작은 애들은 그 값으로 세팅
                if (counter[i] < doneMaxCounter) {
                    counter[i] = doneMaxCounter;
                }
            }
        }
        return counter;
    }
}

package test;

import java.util.Random;

public class test {
    public String solution(int N, int K) {

        String result = "";

        // K=1 이면 a return
        if(K == 1) {
            for(int i=0; i < N; i++){
                result = result + 'a';
            }
            return result;
        }

        // z를 제외한 알파벳 개수중 랜덤(25개)
        Random rand = new Random();
        int r = rand.nextInt(25);

        char ch = (char)('a' + r);

        // N 홀수 여부 체크
        if(N % 2 == 1) {
            result = result + ch;
            ch = (char) (ch + 1);
            K--;
        }

        int num = N / 2;
        while(true) {
            char c = ch;
            for(int i = 0; i < K; i++) {
                result = c + result + c;
                c = (char) (c + 1);
                num = num - 1;
                if(num == 0) {
                    return result;
                }
            }
        }
    }
}

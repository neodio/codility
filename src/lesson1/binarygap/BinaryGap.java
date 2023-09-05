package lesson1.binarygap;

public class BinaryGap {
    public int solution(int N) {
        // write your code in Java SE 8
        String binary = Integer.toBinaryString(N);
        String[] arr = binary.split("");

        int max = 0;
        int current = 0;
        for(int i = 0 ; i < arr.length; i ++) {
            if(arr[i].equals("0")) {
                current ++;
            } else {
                max = (max > current) ? max : current;
                current = 0;
            }
        }
        return max;
    }
}

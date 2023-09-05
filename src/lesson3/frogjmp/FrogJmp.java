package lesson3.frogjmp;

public class FrogJmp {
    public int solution(int X, int Y, int D) {
        // Implement your solution here

        int distance = Y-X;
        if (distance <= 0) {
            return 0;
        }

        double jump = distance / (double) D;
        return (int) Math.ceil(jump);
    }
}

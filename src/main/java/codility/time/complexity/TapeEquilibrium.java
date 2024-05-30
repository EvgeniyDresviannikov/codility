package codility.time.complexity;

public class TapeEquilibrium {
    public static void main(String[] args) {
        int[] A = { 3, 1};
        int result = solution(A);
        System.out.println(result);
    }

    public static int solution(int[] A) {
        int rightSum = 0;
        int leftSum = 0;
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < A.length; i++) {
            rightSum = rightSum + A[i];
        }
        for (int i = 0; i < A.length - 1; i++) {
            leftSum = leftSum + A[i];
            rightSum = rightSum - A[i];
            int curDiff = Math.abs(leftSum - rightSum);
            if (curDiff < minDiff) {
                minDiff = curDiff;
            }
        }
        return minDiff;
    }
}

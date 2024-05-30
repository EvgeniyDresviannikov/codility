package codility.maximum.slice;

public class MaxSliceSum {

    public static void main(String[] args) {
        System.out.println(new MaxSliceSum().solution(new int[]{3,2,-6,4,0}));
    }

    public int solution(int[] A) {
        long curSum = Integer.MIN_VALUE;
        long maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < A.length; i++) {
            curSum = Math.max(curSum + A[i], A[i]);
            maxSum = Math.max(maxSum, curSum);
        }

        return (int)maxSum;
    }
}

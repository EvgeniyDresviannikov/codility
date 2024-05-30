package codility.binarysearch;

public class MinMaxDivision {

    public static void main(String[] args) {
        System.out.println(new MinMaxDivision().solution(3, 5, new int[]{2,1,5,1,2,2,2}));
    }

    public int solution(int K, int M, int[] A) {
        int minSum = 0;
        int maxSum = 0;

        for (int i = 0; i < A.length; i++) {
            minSum = Math.max(minSum, A[i]);
            maxSum += A[i];
        }

        return binarySearch(K, A, minSum, maxSum);
    }

    private int binarySearch(int K, int[] A, int minSum, int maxSum) {
        int result = maxSum;
        while (minSum <= maxSum) {
            int mid = (minSum + maxSum) / 2;
            if (isValidCountOfBlocks(mid, K, A)) {
                result = mid;
                maxSum = mid - 1;
            } else {
                minSum = mid + 1;
            }
        }

        return result;
    }

    private boolean isValidCountOfBlocks(int limit, int K, int[] A) {
        int counter = 1;
        int curSum = 0;

        for (int j : A) {
            curSum += j;
            if (curSum > limit) {
                counter++;
                curSum = j;
            }
        }

        return counter <= K;
    }
}

package codility.arrays;

import java.util.Arrays;

public class CyclicRotation {
    public static void main(String[] args) {
        int[] A = {};
        int K = 2;
        int[] result = Solution(A, K);
        System.out.println(Arrays.toString(result));
    }

    public static int[] Solution(int[] A, int K) {
        if (A.length == 0) return A;

        int temp;
        int len = A.length;

        for (int i = 0; i < K; i++) {
            temp = A[len - 1];
            for (int j = len-1; j > 0; j--) {
                A[j] = A[j-1];
            }
            A[0] = temp;
        }
        return A;
    }
}

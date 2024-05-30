package codility.sorting;

import java.util.Arrays;

public class MaxProductOfThree {

    public static void main(String[] args) {
        MaxProductOfThree maxProductOfThree = new MaxProductOfThree();
        System.out.println(maxProductOfThree.solution(new int[]{-3,1,2,-2,5,6}));
    }
    public int solution(int[] A) {

        Arrays.sort(A);

        int min1 = A[0];
        int min2 = A[1];

        int len = A.length;
        int max1 = A[len-1];
        int max2 = A[len-2];
        int max3 = A[len-3];

        return Math.max(min1*min2*max1, max1*max2*max3);
    }
}

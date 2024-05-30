package codility.arrays;


import java.util.Arrays;

public class OddOccurrencesInArray {

    public static void main(String[] args) {
        System.out.println(new OddOccurrencesInArray().solution(new int[]{1,3,1,3,5}));
    }

    public int solution(int[] A) {
        Arrays.sort(A);
        // 1 1 3 3 5
        for (int i = 0; i < A.length; i = i+2) {
            if (i == A.length-1) return A[i];
            if (A[i] != A[i+1]) {
                return A[i];
            }
        }
        return 0;
    }
}

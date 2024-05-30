package codility.sorting;

import java.util.HashSet;
import java.util.Set;

public class Distinct {

    public static void main(String[] args) {
        System.out.println(new Distinct().solution(new int[]{2,1,1,2,3,1}));
    }

    public int solution(int[] A) {

        Set<Integer> distinctValues = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            distinctValues.add(A[i]);
        }

        return distinctValues.size();
    }
}

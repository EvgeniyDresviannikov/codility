package codility.time.complexity;

import java.util.HashSet;
import java.util.Set;

public class PermMissingElem {

    public static void main(String[] args) {
        System.out.println(new PermMissingElem().solution(new int[]{2,3,1,5}));
    }

    public int solution(int[] A) {
        if (A.length == 0) return 1;

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < A.length+1; i++) {
            set.add(i+1);
        }

        for (int i = 0; i < A.length; i++) {
            set.remove(A[i]);
        }

        return set.iterator().next();

    }
}

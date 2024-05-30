package codility.sieve.of.eratosthenes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class CountNonDivisible {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new CountNonDivisible().solution(new int[]{3,1,2,3,6})));
    }

    public int[] solution(int[] A) {
        Map<Integer, Integer> counts = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            if (counts.containsKey(A[i])) {
                counts.put(A[i], counts.get(A[i]) + 1);
            } else {
                counts.put(A[i], 1);
            }
        }

        int[] result = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            int val = A[i];
            int cnt = 0;
            for (int j = 1; j <= Math.sqrt(val); j++) {
                if (val % j == 0) {
                    cnt += counts.get(j);
                }

                if (j < Math.sqrt(val)) {
                    int opp = val / j;
                    cnt += counts.get(opp);
                }
            }
            result[i] = A.length - cnt;
        }

        return result;
    }
}

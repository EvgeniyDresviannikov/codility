package codility.counting.elements;

import java.util.Arrays;

public class MaxCounters {

    public static void main(String[] args) {
        MaxCounters maxCounters = new MaxCounters();
        System.out.println(Arrays.toString(maxCounters.solution(5, new int[]{3,4,4,6,1,4,4})));
    }

    public int[] solution(int N, int[] A) {
        int[] counters = new int[N];
        int len = A.length;
        int maxCounterValue = 0;
        for (int i = 0; i < len; i++) {
            if (A[i] > N) {
                Arrays.fill(counters, maxCounterValue);
            } else {
                counters[A[i]-1]++;
                maxCounterValue = Math.max(counters[A[i] - 1], maxCounterValue);
            }
        }
        return counters;
    }
}

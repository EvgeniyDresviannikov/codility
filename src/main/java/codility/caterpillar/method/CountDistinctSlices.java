package codility.caterpillar.method;

import java.util.HashSet;
import java.util.Set;

public class CountDistinctSlices {

    int head = 0;
    int tail = 0;
    Set<Integer> values = new HashSet<>();
    int[] A;

    public static void main(String[] args) {
        System.out.println(new CountDistinctSlices().solution(6, new int[]{1,2,3,4,5}));
    }

    public int solution(int M, int[] A) {
        this.A = A;
        int counter = 0;

        while (head < A.length || tail < A.length) {
            if (head < A.length && !values.contains(A[head])) {
                moveHeadForward();
                counter = counter + values.size();
                if (counter > 1000000000) {
                    return 1000_000_000;
                }
            } else {
                moveTailForward();
            }
        }

        return counter;

    }

    private void moveTailForward() {
       values.remove(A[tail]);
       tail++;
    }

    private void moveHeadForward() {
        values.add(A[head]);
        head++;
    }

}

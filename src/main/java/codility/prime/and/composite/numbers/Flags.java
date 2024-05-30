package codility.prime.and.composite.numbers;

import java.util.ArrayList;
import java.util.List;

public class Flags {

    public static void main(String[] args) {
        System.out.println(new Flags().solution(new int[]{1,5,3,4,3,4,1,2,3,4,6,2}));
    }

    public int solution(int[] A) {
        List<Integer> peaks = new ArrayList<>();
        for (int i = 1; i < A.length-1; i++) {
            if (A[i] > A[i-1]) {
                if (A[i] > A[i+1]) {
                    peaks.add(i);
                }
            }
        }

        if (peaks.size() <= 1) return peaks.size();

        int maxFlags = (int)Math.ceil(Math.sqrt(peaks.get(peaks.size()-1) - peaks.get(0)));

        for (int i = maxFlags; i > 1; i--) {
            int flags = 1;
            int previousFlag = peaks.get(0);
            for (int j = 1; j < peaks.size(); j++) {
                if (peaks.get(j) >= previousFlag + i) {
                    flags++;
                    previousFlag = peaks.get(j);
                }
            }
            if (flags == i) return  flags;
        }


        return 0;
    }
}

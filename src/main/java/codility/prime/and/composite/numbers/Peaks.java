package codility.prime.and.composite.numbers;

import java.util.ArrayList;
import java.util.List;

public class Peaks {

    public static void main(String[] args) {
        System.out.println(new Peaks().solution(new int[]{1,2,3,2,3,4,1,2,3,0,6,2}));
    }

    public int solution(int[] A) {
        if (A.length < 3) return 0;

        List<Integer> peaks = new ArrayList<>();
        for (int i = 1; i < A.length-1; i++) {
            if (A[i] > A[i-1]) {
                if (A[i] > A[i+1]) {
                    peaks.add(i);
                }
            }
        }

        if (peaks.isEmpty()) return 0;

        int result = 1;

        for (int i = A.length / peaks.size(); i > 1; i--) {
            int blockSize = i;
            if (A.length%i != 0) continue;

            for (int j = 0; j < A.length / blockSize; j++) {
                int start = j*blockSize;
                int end = (j+1)*blockSize-1;
                boolean foundPeakInsideBlock = false;
                for (int k = 0; k < peaks.size(); k++) {
                    if (peaks.get(k) >= start && peaks.get(k) <= end) {
                        foundPeakInsideBlock = true;
                        break;
                    }
                }
                if (!foundPeakInsideBlock) break;
                result = Math.max(result, A.length / blockSize);
            }

        }

        return result;
    }
}

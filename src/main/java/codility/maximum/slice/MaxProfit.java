package codility.maximum.slice;

public class MaxProfit {

    public static void main(String[] args) {
        System.out.println(new MaxProfit().solution(new int[]{23171, 21011, 21123, 21366, 21013, 21367}));
    }

    public int solution(int[] A) {
        if (A.length == 1) return 0;

        int maxProfit = 0;
        int cumulativeProfit = 0;

        for (int i = 1; i < A.length; i++) {
            int curProfit = A[i] - A[i-1];
            cumulativeProfit = cumulativeProfit + curProfit;
            if (cumulativeProfit > maxProfit) {
                maxProfit = cumulativeProfit;
            }

            if (cumulativeProfit < 0) cumulativeProfit = 0;
        }

        return maxProfit;
    }
}

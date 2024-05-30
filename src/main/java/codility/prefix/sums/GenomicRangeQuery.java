package codility.prefix.sums;

import java.util.Arrays;

public class GenomicRangeQuery {
    public static void main(String[] args) {
        GenomicRangeQuery genomicRangeQuery = new GenomicRangeQuery();

        System.out.println(Arrays.toString(genomicRangeQuery.solution("CCCCGGG", new int[]{2,5,0}, new int[]{4,5,6})));
    }

    public int[] solution(String S, int[] P, int[] Q) {
        int len = P.length;
        int[] res = new int[len];
        int[][] counters = new int[4][S.length()];

        int a = 0;
        int c = 0;
        int g = 0;
        int t = 0;

        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            if (ch == 'A') {
                a++;
            } else if (ch == 'C') {
                c++;
            } else if (ch == 'G') {
                g++;
            } else if (ch == 'T') {
                t++;
            }
            counters[0][i] = a;
            counters[1][i] = c;
            counters[2][i] = g;
            counters[3][i] = t;
        }

        for (int i = 0; i < P.length; i++) {
            int start = P[i];
            int end = Q[i];

            if (counters[0][start] != counters[0][end]) {
                res[i] = 1;
            } else if (counters[1][start] != counters[1][end]) {
                res[i] = 2;
            } else if (counters[2][start] != counters[2][end]) {
                res[i] = 3;
            } else if (counters[3][start] != counters[3][end]) {
                res[i] = 4;
            } else {
                res[i] = getFactor(S.charAt(start));
            }
        }

        // 2, 4, 1
        return res;
    }

    private int getFactor(char c) {
        switch (c) {
            case 'A': return 1;
            case 'C': return 2;
            case 'G': return 3;
            case 'T': return 4;
        }
        return 0;
    }

}

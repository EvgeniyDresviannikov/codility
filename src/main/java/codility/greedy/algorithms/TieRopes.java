package codility.greedy.algorithms;

public class TieRopes {

    public static void main(String[] args) {
        System.out.println(new TieRopes().solution(4, new int[]{5}));
    }

    public int solution(int K, int[] A) {
        int curLength = 0;
        int counter = 0;

        for (int i = 0; i < A.length; i++) {
            curLength += A[i];
            if (curLength >= K) {
                counter++;
                curLength = 0;
            }
        }

        return counter;
    }
}

package codility.greedy.algorithms;

public class MaxNonoverlappingSegments {

    public static void main(String[] args) {
        System.out.println(new MaxNonoverlappingSegments().solution(new int[]{1, 3, 7, 9, 9}, new int[]{5,6,8,9,10}));
    }

    public int solution(int[] A, int[] B) {
        if (A.length == 0) return 0;

        int counter = 1;
        int prev = 0;
        int next = prev + 1;
        while (next < B.length) {
            if (A[next] > B[prev]) {
                counter++;
                prev = next;
            }
            next++;
        }


        return counter;
    }
}

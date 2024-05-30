package codility.caterpillar.method;

import java.util.HashSet;
import java.util.Set;

public class AbsDistinct {

    public static void main(String[] args) {
        System.out.println(new AbsDistinct().solution(new int[]{-2147483648, 0,1,3,3, 5, 6, 9}));
    }

    public int solution(int[] A) {

        Set<Integer> distinctValues = new HashSet<>();
        int counter = 0;
        for (int j : A) {
            if (distinctValues.contains(Math.abs(j))) {

            } else {
                distinctValues.add(Math.abs(j));
                counter++;
            }
        }

        return counter;
    }
}

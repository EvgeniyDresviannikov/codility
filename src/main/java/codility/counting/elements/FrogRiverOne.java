package codility.counting.elements;

import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {
    public static void main(String[] args) {
        FrogRiverOne frogRiverOne = new FrogRiverOne();
        System.out.println(frogRiverOne.solution(5, new int[] {1,3,1,4,2,3,5,4}));
    }

    public int solution(int X, int[] A) {
        Set<Integer> set = new HashSet<>();

        for( int i =0; i< A.length; i++){
            if(A[i]<= X){
                set.add(A[i]);
            }
            if (set.size() == X){
                return i;
            }

        }

        return -1;

    }
}

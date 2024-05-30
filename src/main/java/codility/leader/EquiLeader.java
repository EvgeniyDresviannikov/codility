package codility.leader;

import java.util.HashMap;

public class EquiLeader {

    public static void main(String[] args) {
        System.out.println(new EquiLeader().solution(new int[]{4,3,4,4,4,2}));
    }

    public int solution(int[] A) {
        int len = A.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int dominator = 0;
        int dominatorCount = 0;
        for (int a: A) {
            map.put(a, map.getOrDefault(a, 0) + 1);
            if (map.get(a) > len / 2) {
                dominator = a;
                dominatorCount = map.get(a);
            }
        }

        int dominatorCounterRightSide = dominatorCount;
        int dominatorCounterLeftSide = 0;
        int counterRightSide = len;
        int counterLeftSide = 0;
        int equiLeaders = 0;

        for (int i = 0; i < len; i++) {
            if (A[i] == dominator) {
                dominatorCounterLeftSide++;
                dominatorCounterRightSide--;
            }
            counterLeftSide++;
            counterRightSide--;

            if (dominatorCounterLeftSide > counterLeftSide / 2
                && dominatorCounterRightSide > counterRightSide / 2) {
                equiLeaders++;
            }

        }

        return equiLeaders;
    }
}

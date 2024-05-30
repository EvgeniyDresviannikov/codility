package codility.leader;

import java.util.HashMap;

public class Dominator {

    public static void main(String[] args) {
        System.out.println(new Dominator().solution(new int[]{3,4,3,2,3,-1,3,3}));
    }

    public int solution(int[] A) {
        int len = A.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int index = 0;
        for (int a: A) {
            map.put(a, map.getOrDefault(a, 0) + 1);
            if (map.get(a) > len / 2) return index;

            index++;
        }

        return -1;
    }
}

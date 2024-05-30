package codility.stacksandqueues;

import java.util.Stack;

public class Fish {

    public static void main(String[] args) {
        Fish fish = new Fish();
        System.out.println(fish.solution(new int[]{4,3,2,1,5}, new int[]{0,1,0,0,0}));
    }
    public int solution(int[] A, int[] B) {
        Stack<Integer> stack = new Stack<>();
        int survivals = 0;

        for (int i = 0; i < A.length; i++) {
            int fish = A[i];
            int direction = B[i];

            if (direction == 0) {
                boolean survived = true;
                while (!stack.isEmpty()) {
                    int oppFish = stack.pop();
                    if (oppFish > fish) {
                        survived = false;
                        stack.push(oppFish);
                        break;
                    }
                }
                if (survived) survivals++;
            } else {
                stack.push(A[i]);
            }
        }
        survivals = survivals + stack.size();
        return survivals;

    }
}

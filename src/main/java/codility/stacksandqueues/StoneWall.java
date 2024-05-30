package codility.stacksandqueues;

import java.util.Stack;

public class StoneWall {

    public static void main(String[] args) {
        System.out.println(new StoneWall().solution(new int[]{8,8,5,7,9,8,7,4,8}));
    }

    public int solution(int[] H) {
        Stack<Integer> stack = new Stack<>();
        int counter = 0;
        for (int i = 0; i < H.length; i++) {
            while (!stack.isEmpty() && stack.peek() > H[i]) {
                stack.pop();
            }
            if (!stack.isEmpty() && stack.peek() == H[i]) {
                //nothing
            } else {
                stack.push(H[i]);
                counter++;
            }
        }

        return counter;
    }
}

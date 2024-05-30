package codility.fibonacci.numbers;

import java.util.Arrays;
import java.util.HashMap;

public class FibFrog {

    public static void main(String[] args) {
        System.out.println(new FibFrog().solution(new int[]{0,0,0,1,1,0,1,0,0,0,0}));
    }

    public int solution(int[] A) {
        int[] a = Arrays.copyOf(A, A.length+1);
        a[a.length-1] = 1;
        int [] fibTemp = new int[a.length];
        fibTemp[0] = 0;
        fibTemp[1] = 1;
        int[] fib = new int[0];
        for (int i = 2; i < a.length; i++) {
            fibTemp[i] = fibTemp[i-1] + fibTemp[i-2];
            if (fibTemp[i] > a.length) {
                fib = Arrays.copyOfRange(fibTemp, 2, i);
                break;
            }
        }

        System.out.println(Arrays.toString(fib));

        int[] reachedSteps = new int[a.length];
        for (int i = 0; i < fib.length; i++) {
            if (a[fib[i]-1] == 1) {
                reachedSteps[i-1] = 1;
            }
        }

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(reachedSteps));

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0 || reachedSteps[i] == 1) continue;


        }

        return -1;
    }
}

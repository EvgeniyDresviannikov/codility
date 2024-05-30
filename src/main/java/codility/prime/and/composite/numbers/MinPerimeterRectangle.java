package codility.prime.and.composite.numbers;

public class MinPerimeterRectangle {

    public static void main(String[] args) {
        System.out.println(new MinPerimeterRectangle().solution(30));
    }

    public int solution(int N) {

        int minPerimeter = Integer.MAX_VALUE;

        for (int a = 1; a*a <= N; a++) {
            if (N%a == 0) {
                int b = N / a;
                minPerimeter = Math.min(minPerimeter, 2*(a + b));
            }
        }

        return minPerimeter;
    }
}

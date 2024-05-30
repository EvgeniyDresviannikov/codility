package codility.time.complexity;

public class FrogJmp {

    public static void main(String[] args) {
        System.out.println(new FrogJmp().solution(10, 70, 30));
    }

    public int solution(int X, int Y, int D) {
        if (X == Y) return 0;

        return (Y - X) % D > 0 ? ((Y - X) / D) + 1 : (Y - X) / D;
    }
}

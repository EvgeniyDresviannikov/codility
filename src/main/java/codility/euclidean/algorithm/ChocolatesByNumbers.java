package codility.euclidean.algorithm;

public class ChocolatesByNumbers {

    public static void main(String[] args) {
        System.out.println(new ChocolatesByNumbers().solution(1000000000, 3));
    }

    public int solution(int N, int M) {
        return N / gcdByDivision(N, M);
    }

    int gcdByDivision(int A, int B) {
        if(A % B == 0) return B;
        else           return gcdByDivision(B, A % B);
    }
}

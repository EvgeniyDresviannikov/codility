package codility.prime.and.composite.numbers;

public class CountFactors {

    public static void main(String[] args) {
        System.out.println(new CountFactors().solution(24));
    }

    public int solution(int N) {
        int countFactors = 0;

        for (int i = 1; i*i <= N; i++) {
            if (i*i == N) {
                countFactors++;
                return countFactors;
            }
            if (N%i == 0) countFactors = countFactors + 2;
        }

        return countFactors;
    }
}

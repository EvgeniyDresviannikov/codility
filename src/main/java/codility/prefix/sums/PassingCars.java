package codility.prefix.sums;

public class PassingCars {

    public static void main(String[] args) {
        PassingCars passingCars = new PassingCars();
        System.out.println(passingCars.solution(new int[]{0,1,1,1,0,1,1,0,0}));
    }
    public int solution(int[] A) {
        int oneCount = 0;
        int passingCarCount = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 1) oneCount++;
        }

        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                passingCarCount = passingCarCount + oneCount;
                if (passingCarCount > 1_000_000_000) {
                    return -1;
                }
            } else {
                oneCount--;
            }
        }

        return passingCarCount;
    }
}

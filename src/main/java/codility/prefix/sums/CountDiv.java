package codility.prefix.sums;

public class CountDiv {

    public static void main(String[] args) {
        CountDiv countDiv = new CountDiv();
        System.out.println(countDiv.solution(6, 11, 2));
    }

    public int solution(int A, int B, int K) {
        int firstCount =0;
        int allCount =0;
        if (B==0) return 1;

        if (A>1){
            firstCount = (int)(A-1)/K;
        }
        allCount = (int)B/K;
        if (A==0)
            allCount++;
        return allCount-firstCount;
    }
}

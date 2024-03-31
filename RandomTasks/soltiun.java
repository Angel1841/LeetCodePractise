import java.util.Arrays;

class Solution {
    public int solution(int[] A) {
        Arrays.sort(A);

        int smallestPositive = 1;

        for (int i = 0; i < A.length; i++) {
            if(A[i] == smallestPositive){
                smallestPositive++;
            } else if(A[i] > smallestPositive){
                return smallestPositive;
            }
        }
        return smallestPositive;


    }
}

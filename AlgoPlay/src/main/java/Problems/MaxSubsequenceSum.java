package Problems;

//O(n) solution to solve Max Subsequence Sum problem
public class MaxSubsequenceSum {

    public static void main(String args[]) {
        int[] intArray = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println(maxSubSeq(intArray));
    }

    private static int maxSubSeq(int [] a) {
        int maxSum = 0;
        int thisSum = 0;

        for(int i=0; i<a.length; i++){
            thisSum+=a[i];

            if(maxSum < thisSum){
                maxSum = thisSum;
            }
            if (thisSum < 0) {
                thisSum = 0;
            }
        }
        return maxSum;
    }
}

package Problems;

//O(n) solution to solve Max Subsequence Sum problem
public class MaxSubsequenceSum {

    public static void main(String args[]) {
        int[] intArray = new int[]{4,5,-1,5};
        System.out.println(maxSubSeq(intArray));
    }

    private static int maxSubSeq(int [] a) {
        int maxSum = Integer.MIN_VALUE;
        int thisSum = 0;

        for(int i=0; i<a.length; i++){
            thisSum+=a[i];

            if(thisSum > maxSum){
                maxSum = thisSum;
            } else if (thisSum < 0) {
                maxSum = 0;
            }
        }
        return maxSum;
    }
}

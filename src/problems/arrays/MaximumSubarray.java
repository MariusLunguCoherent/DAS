package problems.arrays;


/**
 * Find the contiguous subarray within an
 * array (containing at least one number) which has the largest sum.
 * For example, given the array [−2,1,−3,4,−1,2,1,−5,4]
 * the contiguous subarray [4,−1,2,1] has the largest sum = 6.
 */
public class MaximumSubarray
{
    public static void main(String[] args)
    {
        int[] array = {1, 2, 5, 7, 89, 2012, 3232, 33, 46, 44, 34, 66, 78};
        MaximumSubarray maximumSubarray = new MaximumSubarray();
        System.out.println(maximumSubarray.maxSubArray(array));

    }

    public int maxSubArray(int[] A)
    {
        int max = A[0];
        int[] sum = new int[A.length];
        sum[0] = A[0];
        for (int i = 1; i < A.length; i++)
        {
            sum[i] = Math.max(A[i], sum[i - 1] + A[i]);
            max = Math.max(max, sum[i]);
        }
        return max;
    }
}

package problems.arrays;

/**
 * Find the contiguous subarray within an array (containing at least one number) which has the largest product.
 * For example, given the array [2,3,-2,4], the contiguous subarray [2,3] has the largest product = 6.
 */
public class MaximumProductSubarray
{
    public static void main(String[] args)
    {
        int[] array = {1, 2, 5, 7, 89, 2012, 3232, 33, 46, 44, 34, 66, 78};
        MaximumSubarray maximumSubarray = new MaximumSubarray();
        System.out.println(maximumSubarray.maxSubArray(array));
    }

    public int maxProduct(int[] A)
    {
        if (A == null || A.length == 0)
            return 0;
        int maxLocal = A[0];
        int minLocal = A[0];
        int global = A[0];
        for (int i = 1; i < A.length; i++)
        {
            int temp = maxLocal;
            maxLocal = Math.max(Math.max(A[i] * maxLocal, A[i]), A[i] * minLocal);
            minLocal = Math.min(Math.min(A[i] * temp, A[i]), A[i] * minLocal);
            global = Math.max(global, maxLocal);
        }
        return global;
    }

}

package problems.arrays;


import java.util.Arrays;

/**
 * Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
 * <p>
 * Return the array in the form [x1,y1,x2,y2,...,xn,yn].
 * Input: nums = [2,5,1,3,4,7], n = 3
 * Output: [2,3,5,4,1,7]
 * Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
 */

public class ShuffleArray
{

    public static void main(String[] args)
    {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;
        System.out.println(Arrays.toString(shuffleArray(n, nums)));
    }

    public static int[] shuffleArray(int n, int[] nums)
    {
        int temp = 0;
        for (int i = 1; i <= n; )
        {
            temp = nums[i];
            nums[i] = nums[n];
            nums[n] = temp;
            i += 2;
        }

        return nums;
    }
}

package problems.arrays;

import java.util.Arrays;

public class SquaredSortedArray
{

    public static void main(String[] args)
    {
        int[] nums = {0, 0, -4, -1, 0, 3, 10, -100};
        SquaredSortedArray squaredSortedArray = new SquaredSortedArray();
        System.out.println(Arrays.toString(squaredSortedArray.sortedSquares(nums)));
    }

    public int[] sortedSquares(int[] nums)
    {
        int val = 0;
        int[] squareArrays = new int[nums.length];
        for (int i = 0; i < nums.length; i++)
        {
            val = nums[i] * nums[i];
            if (i == 0)
            {
                squareArrays[i] = val;
            }
            else
            {
                for (int k = i; k > 0; k--)
                {
                    if (val < squareArrays[k - 1])
                    {
                        squareArrays[k] = squareArrays[k - 1];
                        squareArrays[k - 1] = val;
                    }
                }
                if (val > squareArrays[i])
                {
                    squareArrays[i] = val;
                }

            }
        }
        return squareArrays;
    }
}

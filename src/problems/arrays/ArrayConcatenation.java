package problems.arrays;

import java.util.Arrays;

/**
 * Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and
 * ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
 * <p>
 * Specifically, ans is the concatenation of two nums arrays.
 * <p>
 * Return the array ans.
 */
public class ArrayConcatenation
{

    public static void main(String[] args)
    {
        int[] nums = {1, 2, 3};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }

    public static int[] getConcatenation(int[] nums)
    {
        int[] array = new int[nums.length * 2];
        int position = 0;
        int counter = 0;
        while (counter < 2)
        {
            for (int num : nums)
            {
                array[position] = num;
                position++;
            }
            counter++;
        }


        return array;
    }
}

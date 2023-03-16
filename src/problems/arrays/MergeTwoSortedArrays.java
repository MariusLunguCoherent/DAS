package problems.arrays;

import java.util.Arrays;

public class MergeTwoSortedArrays
{
    public static void main(String[] args)
    {
        int[] array1 = {6, 9, 12, 16, 21, 23, 23, 0, 0};
        int[] array2 = {10, 11, 15, 68, 69, 100, 122, 145};
        System.out.println(Arrays.toString(mergeArrays(array1, array1.length, array2, array2.length)));
    }

    static int[] mergeArrays(int[] nums1, int m, int[] nums2, int n)
    {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] mergedArray = new int[m + n];
        while (i < m && j < n)
        {
            if (nums1[i] != 0 && nums2[j] != 0 && (nums1[i] < nums2[j]))
            {
                mergedArray[k++] = nums1[i++];
            }
            else
                mergedArray[k++] = nums2[j++];
        }

        while (i < m)
        {
            if (nums1[i] != 0)
            {
                mergedArray[k++] = nums1[i++];
            }
            else
            {
                i++;
            }


        }
        while (j < n)
        {
            if (nums2[j] != 0)
            {
                mergedArray[k++] = nums2[j++];
            }
            else
            {
                j++;
            }


        }
        return mergedArray;
    }

}

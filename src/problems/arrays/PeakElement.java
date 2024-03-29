package problems.arrays;


/**
 * A peak element is an element that is greater than its neighbors. Given an input array where num[i] ̸= num[i+1],
 * find a peak element and return its index. The array may contain multiple peaks, in that case return the index to
 * any one of the peaks is fine.
 * You may imagine that num[-1] = num[n] = -∞. For example, in array [1, 2, 3, 1], 3 is
 * a peak element and your function should return the index number 2.
 */
public class PeakElement
{


    public static void main(String[] args)
    {
        int[] array = {1, 2, 5, 7, 89, 2012, 3232, 33, 46, 44, 34, 66, 78, 21, 23232, 22, 3345, 66755};
        PeakElement peakElement = new PeakElement();
        System.out.println(peakElement.findPeakElement(array));
    }

    public int findPeakElement(int[] num)
    {
        int max = num[0];
        int index = 0;
        for (int i = 1; i <= num.length - 2; i++)
        {
            int prev = num[i - 1];
            int curr = num[i];
            int next = num[i + 1];
            if (curr > prev && curr > next && curr > max)
            {
                index = i;
                max = curr;
            }
        }
        if (num[num.length - 1] > max)
        {
            return num.length - 1;
        }
        return index;
    }
}

package problems.arrays;


import java.util.Arrays;

/**
 *
 */
public class MajorityElement
{
    public static void main(String[] args)
    {
        int[] array = {1, 2, 5, 7, 89, 2012, 3232, 33, 46, 44, 34, 66, 78};
        MajorityElement majorityElement = new MajorityElement();
        System.out.println(majorityElement.majorityElement(array));
    }

    public int majorityElement(int[] num)
    {
        if (num.length == 1)
        {
            return num[0];
        }
        Arrays.sort(num);
        int prev = num[0];
        int count = 1;
        for (int i = 1; i < num.length; i++)
        {
            if (num[i] == prev)
            {
                count++;
                if (count > num.length / 2) return num[i];
            }
            else
            {
                count = 1;
                prev = num[i];
            }
        }
        return 0;
    }
}

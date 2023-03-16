package problems.arrays;


/**
 * Given a list of non negative integers, arrange them such that they form the largest number.
 * For example, given [3, 30, 34, 5, 9], the largest formed number is 9534330.
 * Note: The result may be very large, so you need to return a string instead of an integer.
 */
public class LargestNumber
{
    public static void main(String[] args)
    {
        int[] array = {1, 2, 5, 7, 89, 2012, 3232, 33, 46, 44, 34, 66, 78};
        LargestNumber largestNumber = new LargestNumber();
        System.out.println(largestNumber.largestNumber(array));
    }

    public String largestNumber(int[] num)
    {
        String[] NUM = new String[num.length];
        for (int i = 0; i < num.length; i++)
        {
            NUM[i] = String.valueOf(num[i]);
        }
        java.util.Arrays.sort(NUM, new java.util.Comparator<String>()
        {
            public int compare(String left, String right)
            {
                String leftRight = left.concat(right);
                String rightLeft = right.concat(left);
                return rightLeft.compareTo(leftRight);
            }
        });
        StringBuilder sb = new StringBuilder();
        for (String s : NUM)
        {
            sb.append(s);
        }

        java.math.BigInteger result = new java.math.BigInteger(sb.toString());
        return result.toString();
    }
}

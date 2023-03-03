package problems.arrays;

public class FindEvenNumberOfDigits
{
    public static void main(String[] args)
    {
        int[] numbers = {12, 345, 2, 6, 7896};
        FindEvenNumberOfDigits findEvenNumberOfDigits = new FindEvenNumberOfDigits();
        System.out.println(findEvenNumberOfDigits.findNumbers(numbers));
        //   findEvenNumberOfDigits.decomposeNumber();
    }

    public int findNumbers(int[] nums)
    {
        int numbers = 0;
        int countDigits = 0;
        int digit = 0;
        for (int i = 0; i < nums.length; i++)
        {
            digit = nums[i];
            while (digit != 0)
            {
                digit = digit / 10;
                countDigits++;
            }
            if (countDigits % 2 == 0)
            {
                numbers++;
            }
            countDigits = 0;
        }

        return numbers;
    }


    private void decomposeNumber()
    {
        int i = 780960;
        int count = 0;
        while (i != 0)
        {
            i = i / 10;
            count++;
        }
        System.out.println(count);
    }
}

package problems.arrays;


import java.util.Arrays;

/**
 * Given an array of form x0,x1,x2...xn, y0,y1,y2....yn  and n, array length being 2n,
 * write an algorithm to exchange position in array and return array
 * in the form x0,y0,x1,y1,x2,y2....xn,yn
 */
public class SwitchPositionsArray
{

    public static void main(String[] args)
    {
        int[] initArr = {1, 3, 5, 7, 2, 4, 6, 8};
        System.out.println(Arrays.toString(swapPositions(initArr, 4)));
    }

    private static int[] swapPositions(int[] initArray, int n)
    {
        int[] resultArr = new int[initArray.length];

        for (int i = 0; i < initArray.length - 1; i++)
        {
            if (i == 0)
            {
                resultArr[i] = initArray[i];
            }
            else if (i % 2 != 0)
            {
                resultArr[i] = initArray[n + i];
            }
            else
            {
                resultArr[i] = initArray[i];
            }
        }
        return resultArr;
    }

}

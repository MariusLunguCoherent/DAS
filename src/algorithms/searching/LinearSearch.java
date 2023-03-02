package algorithms.searching;

public class LinearSearch
{
    public static int search(int[] array, int x)
    {
        int length = array.length;
        for (int i = 0; i < length; i++) {
            if (array[i] == x)
                return i;
        }
        return -1;
    }

    // Driver's code
    public static void main(String[] args)
    {
        int[] arr = { 20, 30, 14, 120, 400,1210,222 };
        int x = 10;

        // Function call
        int result = search(arr, x);
        if (result == -1)
            System.out.print(
                    "Element is not found!");
        else
            System.out.print("Element found  at index "
                    + result);
    }
}

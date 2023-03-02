package algorithms.searching;

public class BinarySearch
{

    int binarySearch(int[] arr, int low, int high, int x)
    {
        if (high >= low) {
            int mid = low + (high - low) / 2;


            if (arr[mid] == x)
                return mid;

            if (arr[mid] > x)
                return binarySearch(arr, low, mid - 1, x);
            return binarySearch(arr, mid + 1, high, x);
        }

        return -1;
    }


    public static void main(String[] args)
    {
        BinarySearch ob = new BinarySearch();
        int[] array = {12, 31, 210, 420, 1011, 4022, 21221, 322221, 4343422, 5332322, 222321321 };
        int n = array.length;
        int x = 420;
        int result = ob.binarySearch(array, 0, n - 1, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index "
                    + result);
    }
}

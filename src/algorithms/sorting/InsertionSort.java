package algorithms.sorting;

public class InsertionSort
{
    /*Function to sort array using insertion sort*/
    void sort(int [] arrayToSort)
    {
        int n = arrayToSort.length;
        for (int i = 1; i < n; ++i) {
            int key = arrayToSort[i];
            int k = i - 1;

            /* Move elements  that are
               greater than key, to one position ahead
               of their current position */
            while (k >= 0 && arrayToSort[k] > key) {
                arrayToSort[k + 1] = arrayToSort[k];
                k = k - 1;
            }
            arrayToSort[k + 1] = key;
        }
    }

    /* A utility function to print array of size n*/
    static void printArray(int[] sortedArray)
    {
        int n = sortedArray.length;
        for (int i = 0; i < n; ++i)
            System.out.print(sortedArray[i] + " ");

        System.out.println();
    }

    // Driver method
    public static void main(String[] args)
    {
        int[] arrayToBeSorted = { 1221, 100, 233, 5090, 690909 };

        InsertionSort ob = new InsertionSort();
        ob.sort(arrayToBeSorted);

        printArray(arrayToBeSorted);
    }

}

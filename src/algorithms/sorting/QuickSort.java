package algorithms.sorting;


/*
* Implementation of QuickSort in java
*
* */
public class QuickSort
{

    static void swap(int[] array, int i, int j)
    {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


    static int partition(int[] arr, int low, int high)
    {

        // pivot
        int pivot = arr[high];

        // Index of smaller element and
        // indicates the right position
        // of pivot found so far
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {

            // If current element is smaller
            // than the pivot
            if (arr[j] < pivot) {

                // Increment index of
                // smaller element
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }


    static void quickSort(int[] arrayToSort, int low, int high)
    {
        if (low < high) {
            int pi = partition(arrayToSort, low, high);
            quickSort(arrayToSort, low, pi - 1);
            quickSort(arrayToSort, pi + 1, high);
        }
    }


    static void printArray(int[] sortedArray, int size)
    {
        for (int i = 0; i < size; i++)
            System.out.print(sortedArray[i] + " ");

        System.out.println();
    }

    // Driver Code
    public static void main(String[] args)
    {
        int[] array = { 1001, 728, 810, 90, 2121, 5210, 121, 23232, 990288348, 10 };
        int n = array.length;

        quickSort(array, 0, n - 1);
        System.out.println("Sorted array: ");
        printArray(array, n);
    }
}

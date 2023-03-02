package algorithms.sorting;

public class HeapSort
{
    public void sort(int[] arraySort)
    {
        int N = arraySort.length;

        // Build heap (rearrange array)
        for (int i = N / 2 - 1; i >= 0; i--)
            heapify(arraySort, N, i);

        // One by one extract an element from heap
        for (int i = N - 1; i > 0; i--) {
            // Move current root to end
            int temp = arraySort[0];
            arraySort[0] = arraySort[i];
            arraySort[i] = temp;

            // call max heapify on the reduced heap
            heapify(arraySort, i, 0);
        }
    }


    void heapify(int[] array, int N, int i)
    {
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2


        if (l < N && array[l] > array[largest])
            largest = l;


        if (r < N && array[r] > array[largest])
            largest = r;

        // If largest is not root
        if (largest != i) {
            int swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(array, N, largest);
        }
    }

    /* A utility function to print array of size n */
    static void printArray(int[] array)
    {
        int N = array.length;

        for (int i = 0; i < N; ++i)
            System.out.print(array[i] + " ");
        System.out.println();
    }

    // Driver's code
    public static void main(String[] args)
    {
        int[] arrayToSort = { 1222, 1100, 123, 52102, 60, 1217 };
        int N = arrayToSort.length;

        // Function call
        HeapSort ob = new HeapSort();
        ob.sort(arrayToSort);

        System.out.println("Sorted array is");
        printArray(arrayToSort);
    }

}

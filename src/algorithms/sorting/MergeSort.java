package algorithms.sorting;

public class MergeSort
{
    // Merges two sub-arrays of arraysToSort[].
    // First subarray is arraysToSort[l..m]
    // Second subarray is arraysToSort[m+1..r]
    void merge(int[] arraysToSort, int l, int m, int r)
    {

        int n1 = m - l + 1;
        int n2 = r - m;


        int L[] = new int[n1];
        int R[] = new int[n2];


        for (int i = 0; i < n1; ++i)
            L[i] = arraysToSort[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arraysToSort[m + 1 + j];

        /* Merge the temp arrays */


        int i = 0, j = 0;


        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arraysToSort[k] = L[i];
                i++;
            }
            else {
                arraysToSort[k] = R[j];
                j++;
            }
            k++;
        }


        while (i < n1) {
            arraysToSort[k] = L[i];
            i++;
            k++;
        }


        while (j < n2) {
            arraysToSort[k] = R[j];
            j++;
            k++;
        }
    }


    void sort(int[] arr, int l, int r)
    {
        if (l < r) {
            // Find the middle point
            int m = l + (r - l) / 2;
            sort(arr, l, m);
            sort(arr, m + 1, r);


            merge(arr, l, m, r);
        }
    }

    //A utility function to print array of size n
    static void printArray(int[] arraysSorted)
    {
        int n = arraysSorted.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arraysSorted[i] + " ");
        System.out.println();
    }


    public static void main(String[] args)
    {
        int[] arraysToSort = { 12, 11, 13, 5, 6, 7 };

        System.out.println("Given Array");
        printArray(arraysToSort);

        MergeSort ob = new MergeSort();
        ob.sort(arraysToSort, 0, arraysToSort.length - 1);

        System.out.println("\nSorted array");
        printArray(arraysToSort);
    }

}

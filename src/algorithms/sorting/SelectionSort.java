package algorithms.sorting;


/*
* Implementation of Selection Sorting algorithm
* */
public class SelectionSort
{
    void sort(int[] array)
    {


        // One by one move boundary of unsorted subarray
        for (int i = 0; i < array.length-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < array.length; j++)
                if (array[j] < array[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first element, initially considered as min
            int temp = array[min_idx];
            array[min_idx] = array[i];
            array[i] = temp;
        }
    }

    // Print the array sorted
    void printArray(int[] sortedArray)
    {
        int n = sortedArray.length;
        for (int i=0; i<n; ++i)
            System.out.print(sortedArray[i]+" ");
        System.out.println();
    }


    public static void main(String[] args)
    {
        SelectionSort ob = new SelectionSort();
        int [] arrayToSort = {69,250,1223,221,11001, 100, 9102,120021};
        ob.sort(arrayToSort);
        System.out.println("Sorted array");
        ob.printArray(arrayToSort);
    }

}

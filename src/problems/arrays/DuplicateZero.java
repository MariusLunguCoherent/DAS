package problems.arrays;

public class DuplicateZero
{

    public static void main(String[] args)
    {
        int [] arr = {1,0,2,3,0,4,5,0};
        DuplicateZero duplicateZero = new DuplicateZero();
      duplicateZero.duplicateZeros(arr);
    }

    public void duplicateZeros(int[] arr)
    {
      int length = arr.length;
      for(int i = 0 ; i<length; i++){
         if(arr[i]==0 && i<length-1){
             for(int k = length-1; k>i; k--){
                 arr[k] = arr[k-1];
             }
            arr[i+1] = arr[i];
             i++;
         }
      }
    }
}

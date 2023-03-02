package problems;

public class FindPerfectNumbers
{
    /**
     * Find all perfect number from 1 to 1000 and print it
     * <p>
     * */
    public static void main(String[] args)
    {
        int div ;
        for (int i=1; i <= 1000; i++)
        {
            div = 0;
            for (int k=1; k< i ; k++)
            {
               if(i%k == 0){
                   div+=k;
               }
            }
            if(div == i){
                System.out.println(div);
            }

        }



    }

}

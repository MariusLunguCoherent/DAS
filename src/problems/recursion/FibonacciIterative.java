package problems.recursion;


/**
 * Iterative Fibonacci implementation
 *
 * */
public class FibonacciIterative
{

    static int  count = 15;
    static  int n1 = 0, n2 =1, n3 = 0;
    public static void main(String[] args)
    {
         while(n3 <= count){
             System.out.print(" " + n3);
             n3 = n1 + n2;
             n1 = n2;
             n2 = n3;

         }
    }
}

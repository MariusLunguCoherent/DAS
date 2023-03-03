package problems.recursion;


/**
 * Given a positive integer  the class will compute the factorial value for that number
 *
 * */
public class RecursiveFactorial
{

    public static void main(String[] args)
    {
        int n = 9;
        System.out.println("Factorial of " + n + " is : " + computeFactorial(n));
    }

    static int computeFactorial(int n){
        if(n == 1)
            return  1;
        else
            return (n* computeFactorial(n-1));
    }
}

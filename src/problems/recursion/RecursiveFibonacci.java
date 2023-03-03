package problems.recursion;

public class RecursiveFibonacci
{
    static int n1 = 0, n2 = 1, n3 = 0;

    public static void main(String[] args)
    {
        int count = 10;

        generateFibonacci(count);
    }

    static void generateFibonacci(int n)
    {

        if (n > 0)
        {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
            generateFibonacci(n - 1);
        }
    }
}

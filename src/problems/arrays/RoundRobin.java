package problems.arrays;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Implementation for a round-robin  algorithm to return random address from a list of predefined 10 distinct
 * addresses
 */
public class RoundRobin
{
    private static final String HOST_BASE = "10.10.1.";
    private static int index = 0;
    static Set<String> address;
    static Object[] addressArray;
    static Random rand = new Random();

    public static void main(String[] args)
    {
        address = new HashSet<>(10);
        generateAddress(address);
        for (int k = 0; k < 10; k++)
        {
            index = rand.nextInt(10);
            System.out.println(get());
        }
    }

    private static String get()
    {
        return addressArray[index].toString();
    }

    private static void generateAddress(Set<String> address)
    {

        for (int i = 0; i < 10; i++)
        {
            address.add(HOST_BASE + rand.nextInt(100));
        }

        addressArray = address.toArray();
    }

}

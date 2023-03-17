package Collections;

import java.util.HashMap;


/**
 * HashMap multithreading operations.
 * */
public class HashMapE2 extends  Thread
{
    static HashMap<Integer,String> stringHashMap =new HashMap<Integer,String>();
    public void run()
    {
        try
        {
            Thread.sleep(2000);
            // Child thread trying to add object
            // Adding new element in the object with the key 103
            stringHashMap.put(103,"A");
        }
        catch(InterruptedException e)
        {
            System.out.println("Child Thread will add objects");
        }
    }

    public static void main(String[] args) throws InterruptedException
    {
        stringHashMap.put(100,"X");
        stringHashMap.put(101,"Y");
        stringHashMap.put(102,"Z");
        HashMapE2 hashMapE2=new HashMapE2();
        hashMapE2.start();
        for (Object o : stringHashMap.entrySet())
        {
            System.out.println(o);
            Thread.sleep(1000);
        }
        System.out.println(stringHashMap);
    }
}

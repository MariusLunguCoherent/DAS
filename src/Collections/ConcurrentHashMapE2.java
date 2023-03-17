package Collections;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapE2 extends  Thread
{
    static ConcurrentHashMap<Integer,String> concurrentHashMap =new ConcurrentHashMap<Integer,String>();
    public void run()
    {
        try
        {
            Thread.sleep(3000);
            // Child thread trying to add Objects
            // Adding new element in the object
            concurrentHashMap.put(103,"D");
        }
        catch(InterruptedException e)
        {
            System.out.println("Child Thread will add objects");
        }
    }

    public static void main(String[] args) throws InterruptedException
    {
        concurrentHashMap.put(100,"X");
        concurrentHashMap.put(101,"Y");
        concurrentHashMap.put(102,"Z");
        ConcurrentHashMapE2 concurrentHashMapE2=new ConcurrentHashMapE2();
        concurrentHashMapE2.start();
        for (Object o : concurrentHashMap.entrySet())
        {
            System.out.println(o);
            Thread.sleep(2000);
        }
        System.out.println(concurrentHashMap);
    }
}

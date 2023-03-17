package Collections;

import java.util.concurrent.ConcurrentHashMap;


/**
 * Not accepting null as key.
 * */
public class ConcurrentHashMapE1
{
    public static void main(String[] args)
    {
        ConcurrentHashMap<Integer, String> concurentHashMap=new ConcurrentHashMap<Integer, String>();
        concurentHashMap.put(100,"Stark");
        concurentHashMap.put(101,"Michale");
        concurentHashMap.put(102,"Ani");
        concurentHashMap.put(null,"Sofia");
        System.out.println(concurentHashMap);
    }
}

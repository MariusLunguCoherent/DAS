package Collections;

import java.util.HashMap;

public class HashMapE1
{
    public static void main(String[] args)
    {
        HashMap<Integer, String> hashMap=new HashMap<>();
        hashMap.put(100, "John");
        hashMap.put(101,"Michelle");
        hashMap.put(102,"Ana");
        hashMap.put(null,"Sofia");
        System.out.println(hashMap);
    }
}

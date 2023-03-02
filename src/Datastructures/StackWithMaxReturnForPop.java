package Datastructures;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class StackWithMaxReturnForPop
{
    private int [] items;
    int size = 0;

    public  StackWithMaxReturnForPop( int capacity)
    {
        size = capacity;
        items = new int[size];
    }
    public void push(int item)
    {
        int i = size - 1;
        while(i>0){
            if (item > items[i]){
                items[i-1]  = items [i];
                items [i] = item;
                break;
            }
            i--;
        }

    }

    @Override
    public String toString()
    {
        return "StackWithMaxReturnForPop{" +
                "items=" + Arrays.toString(items) +
                ", N=" + size +
                '}';
    }

    public String pop(){
        return  null;
    }


    public static void main(String[] args)
    {
        StackWithMaxReturnForPop stackWithMaxReturnForPop = new StackWithMaxReturnForPop(10);
        for( int i = 0; i< 10 ; i++){

            stackWithMaxReturnForPop.push(ThreadLocalRandom.current().nextInt(100));
        }

        System.out.println(stackWithMaxReturnForPop);
    }
}

package Datastructures;

public class StackGenericsByArray implements StackGenerics
{

    private String [] items;
    private int N = 0;


    public StackGenericsByArray(int capacity){
        this.N = capacity;
    }
    @Override
    public boolean isEmpty()
    {
        return N == 0;
    }

    /**
     * when there is no space for the next element - expand the array by double the size
     * This is the most optimal way to resize / assign new memory for array in stacks
     * */
    @Override
    public void push(String item)
    {
        if(N == items.length) resize(2 * items.length);
        items[N++] = item;
    }


    /**
     * When the array is 1/4  filled than resize the array to  free the memory
     * */
    @Override
    public String pop()
    {
        String item = items[--N];
        items[N] = null;
        if(N > 0 && N == items.length/4) resize(items.length/2);
        return item;
    }

    /**
     * Resize the array means to assign new array with size twice as initial array.

     * */

    private void resize(int capacity){
        String [] copy = new String[capacity];
        for ( int i = 0; i< N; i++) copy[i] = items[i];
        items = copy;
    }
}

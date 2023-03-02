package Datastructures;

public class QueueByArray implements QueuesGenerics
{

    int queueSize=0;

    private final Object [] array;
    int  head=0;
    int tail =-1;
    int currentSize=0;
    public QueueByArray(int capacity){
        queueSize = capacity;
        array  = new Object[capacity];

    }

    @Override
    public void enqueue(String item)
    {
      if(isEmpty()){
          array[head] = item;
          array[tail] = item;
          tail ++;
      }else if(isFull()) {
          throw  new RuntimeException("Queue is full!");
      }else
      {
         array[++tail] =  item;
      }

    }

    @Override
    public String dequeue()
    {
        return array[head].toString();
    }

    @Override
    public boolean isEmpty()
    {
        return currentSize == 0;
    }

    @Override
    public int size()
    {
        return currentSize;
    }

    public boolean isFull(){
        return currentSize == queueSize;
    }
}

package Datastructures;




public class QueueByLinkedList implements QueuesGenerics
{
    Node head, tail;

    @Override
    public void enqueue(String item)
    {
         Node lastOld = tail;
         Node  last = new Node();
         last.data = item;
         lastOld.next = last;
         last.next = null;
         tail  = last;

    }

    @Override
    public String dequeue()
    {
      String item = head.data;
      head = head.next;
      return item;
    }

    @Override
    public boolean isEmpty()
    {
        return head == null;
    }

    @Override
    public int size()
    {
        return 0;
    }


    private class Node {
        String data;
        Node next;
}
}

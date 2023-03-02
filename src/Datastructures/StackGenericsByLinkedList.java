package Datastructures;


/**
 * For stack implementation with linked list the every operation take constant time in worst case.
 * The memory taken is 40N (40 bytes per eah node
 * - 16 Bytes Object overhead
 * - 8 bytes (inner class overhead)
 * - 8 bytes reference to string
 * - 8 bytes reference to Node)
 * */
public class StackGenericsByLinkedList implements StackGenerics
{

    private Node first = null;

    @Override
    public boolean isEmpty()
    {
        return first == null;
    }

    /**
     * default behaviour for push. Insert new node and set current
     * first element to be next element for the newly created node.
     * */
    @Override
    public void push(String item)
    {
        Node oldFirst =  first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
    }


    /**
     * default pop behaviour. Mark as first item in stack the next node from the first.
     * Return the current  first node item.
     * */
    @Override
    public String pop()
    {
        String item = first.item;
        first = first.next;
        return item;
    }

    private class Node{
        String item;
         Node next;
    }
}

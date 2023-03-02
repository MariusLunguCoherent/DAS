package problems;

public class Main
{
    public static void main(String[] args)
    {
        LinkedListExchangeNodes linkedListExchangeNodes = new LinkedListExchangeNodes();

        linkedListExchangeNodes.fillLinkedList();

        linkedListExchangeNodes.printLinkedList();
        linkedListExchangeNodes.swapArrayOfNodes(4);
        linkedListExchangeNodes.printLinkedList();

    }
}
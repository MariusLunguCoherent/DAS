package problems;

public class LinkedListExchangeNodes
{
    Node head;
    static class Node{
        int  id ;
        Node next;
        Node(int data){
            id = data;
        }
    }
    /**
     *
     * Add node as tail.
     * */
    public void addNode(Node node){
        Node currentNode = head;

        if(head!=null  && head.next == null){
            head.next = node;
            return;
        }

        while(true){
            assert currentNode != null;
            if (currentNode.next == null)
                break;
            currentNode = currentNode.next;
        }

        currentNode.next = node;
        node.next = null;
    }

    /**
     * Insert node in some position.
     * */
    public void insertNode(int position, Node toInsert){
       Node currentNode = head;
       int counter = 1;
       int nodeToExchangePosition = position - 1;
       while( currentNode.next != null)
       {
           if(nodeToExchangePosition == counter){
               toInsert.next = currentNode.next;
               currentNode.next = toInsert;
           }
           currentNode = currentNode.next;
           counter ++;
       }
    }

    /**
     * Method will swap the number  of nodes  equal with position value -1 (because the node from position is exclusive),
     * that occurs before the  node from this position with the same number of nodes
     * that are after the node from this position.
     * @param position -> indicate the position of the node and also the number of nodes to swap that are before and
     *                 after this node

     *  e.g : given the list : 15->11->1->2->3->4->5-6->7->8->9 and position 4 - should result:
     *                 3->4->5->2->15->11->1->6->7->8->9
     *
     * */
    public void swapArrayOfNodes(int position){
        Node node = head;

        if(head == null){
            throw  new RuntimeException("Empty list. Please add nodes");
        }
        if(head.next == null){
            throw  new RuntimeException("The list has just one node. Please add  double * position nodes");
        }
        int counter = 1;
        int arrayLen = position-1;
        Node tail = null;
        Node positionNode = null;
        Node previousHead = head;
        while(node.next!=null)
        {
            if(counter == arrayLen){
                tail = node;
                positionNode = node.next;
            }
            else if (counter == 2 * arrayLen + 1)
            {
                assert tail != null;
                tail.next = node.next;
                node.next = positionNode;
                head = positionNode.next;
                positionNode.next = previousHead;

            }
            node = node.next;
            counter++;
        }


    }

    /**
     *
     * Insert node as head.
     * */
    public void insertHead(Node newHead){
        newHead.next = head;
        head = newHead;
    }

    /**
     * Function to populate this LinkedList for tests
     *
     * */
    public void fillLinkedList(){
        Node head  = new Node(0);
        this.insertHead(head);
        for (int i = 1; i < 10; i++)
        {
           Node node = new Node(i);

           this.addNode(node);
        }
    }

    /**
     * Print the content of the LinkedList
     * */
    public void printLinkedList(){
        Node currentNode = head;

        while (currentNode.next!=null)
        {
            System.out.print(currentNode.id + "->");
            currentNode = currentNode.next;
        }
        System.out.println("NULL ");
    }

}

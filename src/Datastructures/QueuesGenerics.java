package Datastructures;

public interface QueuesGenerics
{

    void enqueue(String item); // insert a new string onto queue
    String dequeue();  //remove and return the string recently added
    boolean isEmpty(); //is queue empty?
    int size(); // return number of string on the queue

}

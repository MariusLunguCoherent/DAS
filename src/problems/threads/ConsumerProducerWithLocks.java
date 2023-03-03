package problems.threads;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ConsumerProducerWithLocks
{
}

 class MyQueue<E>{
    private int maxSize = 16;
    private ReentrantLock lock = new ReentrantLock(true);
    private Condition notEmpty = lock.newCondition();
    private  Condition notFull = lock.newCondition();

    private Queue<E> queue ;
    MyQueue(int size){
        this.maxSize = size;
        queue = new LinkedList<E>();
    }

    public void put(E e){
        lock.lock();
        try{
            while (queue.size() == maxSize){
                notFull.await();  /* the thread that wants to add item in queue release the lock temporarily,  until notFull condition is
                TRIGGERED by the consumer THREAD. */
            }
            notEmpty.signalAll(); // will signal all threads that are waiting for the queue to not being empty anymore
            queue.add(e);
        } catch (InterruptedException ex)
        {
            throw new RuntimeException(ex);
        } finally
        {
            lock.unlock();
        }

    }

    public E take(){
        lock.lock();
        try{
            while(queue.size() == 0){
                notEmpty.await(); /* the consumer thread that call take() - will release the lock temporarily,
                 and will enter in await state here, until the PRODUCER thread
                will signal that the queue IS NOT EMPTY anymore */
            }
            E item = queue.remove();
            notFull.signalAll(); // will signal all for threads that are waiting for the queue to not be empty anymore
            return  item;
        } catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        } finally
        {
            lock.unlock();
        }

    }
}

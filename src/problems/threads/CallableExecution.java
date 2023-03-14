package problems.threads;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class CallableExecution implements Callable
{
    /**
     * Computes a result, or throws an exception if unable to do so.
     *
     * @return computed result
     * @throws Exception if unable to compute a result
     */
    @Override
    public Object call() throws Exception
    {

        Random random   = new Random();
        Integer randomNumber  = random.nextInt(100);
        Thread.sleep(5000);
        return randomNumber;
    }

    public static void main(String[] args) throws Exception
    {

        // FutureTask is a concrete class that
        // implements both Runnable and Future
        FutureTask[] randomNumberTasks = new FutureTask[8];

        for (int i = 0; i < 8; i++)
        {
            var callable = new CallableExecution();

            // Create the FutureTask with Callable
            randomNumberTasks[i] = new FutureTask(callable);

            // As it implements Runnable, create Thread
            // with FutureTask
            Thread t = new Thread(randomNumberTasks[i]);
            t.start();
        }

        for (int i = 0; i < 8; i++)
        {
            // As it implements Future, we can call get()
            System.out.println(randomNumberTasks[i].get());


        }
    }
}

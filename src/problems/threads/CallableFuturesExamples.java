package problems.threads;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFuturesExamples
{
    public static void main(String[] args)
    {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

       //Submit task and retrieve the placeholder object to be able to check the result
       Future<Integer> future = executorService.submit(new Task());

        try
        {
             Integer result = future.get(); //blocking here
            System.out.println("Result from task is : " + result);
        }catch (InterruptedException | ExecutionException e){
            e.printStackTrace();
        }
    }


    static class Task implements Callable<Integer>{
        /**
         * Computes a result, or throws an exception if unable to do so.
         *
         * @return computed result
         * @throws Exception if unable to compute a result
         */
        @Override
        public Integer call() throws Exception
        {
            return new Random().nextInt(1000);
        }



    }
}

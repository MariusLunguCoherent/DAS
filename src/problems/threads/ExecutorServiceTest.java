package problems.threads;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceTest
{
    public static void main(String[] args)
    {
        int coreCount = Runtime.getRuntime().availableProcessors();
        System.out.println("coreCount : " + coreCount);
        ExecutorService service  = Executors.newCachedThreadPool();
        for (int i = 0;  i< 1000; i++)
        {

            service.execute(new Task());
            System.out.print("count  = " + i + " ");
        }
        service.shutdown();
    }
    static class Task implements Runnable{
        @Override
        public void run()
        {
            System.out.println("Thread name : " + Thread.currentThread().getName());

        }
    }
}

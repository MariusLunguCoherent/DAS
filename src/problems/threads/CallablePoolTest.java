package problems.threads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallablePoolTest
{
    public static void main(String[] args) {
        int numWorkers = Integer.parseInt(args[0]);

        ExecutorService pool;
        pool = Executors.newCachedThreadPool();
        CallableWorkerThread [] workers = new CallableWorkerThread[numWorkers];
        Future[] futures;
        futures = new Future[numWorkers];

        for (int i = 0; i < numWorkers; ++i) {
            workers[i] = new CallableWorkerThread(i + 1);
            futures[i] = pool.submit(workers[i]);
        }
        for (int i = 0; i < numWorkers; ++i) {
            try {
                System.out.println(futures[i].get() + " ended");
            } catch (InterruptedException | ExecutionException ex) {
                ex.printStackTrace();
            }
        }
    }
}

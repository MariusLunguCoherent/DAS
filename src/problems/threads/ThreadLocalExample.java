package problems.threads;

import java.util.Random;

public class ThreadLocalExample
{

    public static void main(String[] args) throws InterruptedException
    {
        TaskRunnable taskRunnable = new TaskRunnable();
        Thread th1 = new Thread(taskRunnable);
        Thread th2 = new Thread(taskRunnable);
        th1.setName(" Thread 1 ");
        th2.setName(" Thread 2 ");
        th1.start();
        th2.start();

        th1.join();
        th2.join();

    }

    static class TaskRunnable implements Runnable
    {
        private final ThreadLocal<Integer> threadLocal = new ThreadLocal<>();

        /**
         * When an object implementing interface {@code Runnable} is used
         * to create a thread, starting the thread causes the object's
         * {@code run} method to be called in that separately executing
         * thread.
         * <p>
         * The general contract of the method {@code run} is that it may
         * take any action whatsoever.
         *
         * @see Thread#run()
         */
        @Override
        public void run()
        {
            threadLocal.set(new Random().nextInt(100));
            try
            {
                Thread.sleep(2000);
            } catch (InterruptedException e)
            {
                System.out.println(e.getMessage());

            }
            System.out.println("Current running thread: " +Thread.currentThread().getName() + " threadLocalValue : " + threadLocal.get());
        }

    }
}

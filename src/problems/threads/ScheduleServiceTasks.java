package problems.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.lang.Thread.sleep;

public class ScheduleServiceTasks
{
    public static void main(String[] args)
    {
        ExecutorService service = Executors.newSingleThreadExecutor();
        List<Task> taskList = new ArrayList<>();
        List<Task> oddTasksId = new ArrayList<>();

        for (int i = 0; i < 10; i++)
        {
            if (i % 2 == 0)
            {
                oddTasksId.add(new Task("Task " + i));
            }
            else
            {
                taskList.add(new Task("Task " + i));
            }
        }

        taskList.stream().forEach(t -> service.execute(t));
        oddTasksId.stream().forEach(t -> service.execute(t));

    }

    /**
     * Task to be executed in a schedule manner.
     */

    static class Task implements Runnable
    {
        String taskId = null;

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
            System.out.println("Task Id : " + taskId + "  Thread name : " + Thread.currentThread().getName());
            try
            {
                sleep(100);
            } catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }
        }

        Task(String s)
        {
            taskId = s;
        }
    }
}

package problems.threads;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * This class will write data in a synchronized manner in one file
 */
public class SynchronizeWritingInFile
{

    static ReentrantLock lock = new ReentrantLock(true);
    static Condition finishedWriting = lock.newCondition();
    static String[] firstArray = {"Numele ", " este ", " Emil "};
    static String[] secondArray = {" meu ", " Lungu ", " Marius "};
    static AtomicInteger counter = new AtomicInteger(0);
    FileWriter fileWriter;

    public SynchronizeWritingInFile(FileWriter fileWriter)
    {
        this.fileWriter = fileWriter;
    }

    public static void main(String[] args) throws IOException
    {
        SynchronizeWritingInFile synchronizeWritingInFile = new SynchronizeWritingInFile(new FileWriter(new File(
                "test.log")));
        Thread t1 = new Thread(new WriterThread(firstArray, synchronizeWritingInFile.fileWriter));
        Thread t2 = new Thread(new WriterThread(secondArray, synchronizeWritingInFile.fileWriter));
        t1.start();
        t2.start();
    }

    static class WriterThread implements Runnable
    {

        String[] words;
        FileWriter fileWriter;


        public WriterThread(String[] stringsArray, FileWriter file)
        {
            this.words = stringsArray;
            this.fileWriter = file;
        }

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
            lock.lock();
            try
            {
                if(counter.intValue() < secondArray.length){
                    fileWriter.write(words[counter.intValue()]);
                    fileWriter.flush();
                    counter.addAndGet(1);
                    finishedWriting.await();

                }else {
                    fileWriter.close();
                }



            } catch (IOException e)
            {
                throw new RuntimeException(e);

            } catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            } finally
            {
                lock.unlock();
            }


        }
    }
}

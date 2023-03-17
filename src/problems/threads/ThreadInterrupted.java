package problems.threads;

public class ThreadInterrupted
{

    public static void main(String[] args)
    {
      Thread generateNumbers = new Thread(new NumberGenerator());
      generateNumbers.start();
      if(generateNumbers.isAlive()){
          generateNumbers.interrupt();
          System.out.println("Is thread number generators interrupted : " + generateNumbers.isInterrupted());

      }


    }


   static class NumberGenerator implements Runnable{

        /**
         * When an object implementing interface <code>Runnable</code> is used
         * to create a thread, starting the thread causes the object's
         * <code>run</code> method to be called in that separately executing
         * thread.
         * <p>
         * The general contract of the method <code>run</code> is that it may
         * take any action whatsoever.
         *
         * @see Thread#run()
         */
        @Override
        public void run()
        {
            for ( int i = 0; i < 20 ; i ++){
                if(i == 5){
                    try
                    {
                        Thread.sleep(10000);
                    } catch (InterruptedException e)
                    {
                        System.out.println("This thread has received an Interrupted signall and will resume!" );
                    }
                }
                System.out.println("Number : " + i);
            }
        }
    }
}

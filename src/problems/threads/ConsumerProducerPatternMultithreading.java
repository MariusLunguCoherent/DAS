package problems.threads;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadLocalRandom;

public class ConsumerProducerPatternMultithreading
{

    //Define the storage of the Person items as BlockingQueue

    static BlockingQueue<Person> personStorage = new ArrayBlockingQueue(10);

    public static void main(String[] args) throws InterruptedException
    {
        Runnable producer = () ->
        {
            int randomNum = 0;
            while (true)
            {

                try
                {
                    randomNum = ThreadLocalRandom.current().nextInt(1, 100 + 1);
                    personStorage.put(new Person("Marius", "Lungu", randomNum));
                } catch (InterruptedException e)
                {
                    throw new RuntimeException(e);
                }
            }

        };

        Runnable consumer = () ->
        {
            while (true)
            {
                var person = personStorage.poll();
                System.out.println(person);
            }

        };

        new Thread(producer).start();
        new Thread(producer).start();
        new Thread(consumer).start();
        new Thread(consumer).start();

        Thread.sleep(5000);

    }

    static class Person
    {
        String name;
        String lastName;
        int age;

        public Person(String name, String lastName, int age)
        {
            this.age = age;
            this.name = name;
            this.lastName = lastName;
        }

        @Override
        public String toString()
        {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

}

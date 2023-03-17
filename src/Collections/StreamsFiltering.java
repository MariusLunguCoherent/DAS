package Collections;


import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsFiltering
{

    public void dropWhile() throws Exception
    {
        System.out.println("using filter");
        Stream.of(2, 4, 6, 8, 9, 10, 12).filter(n -> n % 2 == 0)
                .forEach(n -> System.out.print(n + " "));
        System.out.println();
        System.out.println("using dropWhile");
    }


    public void takeWhile() throws Exception
    {
        // using filter
        System.out.println("using filter");
        Stream.of(2, 4, 6, 8, 9, 10, 12).filter(n -> n % 2 == 0)
                .forEach(n -> System.out.print(n + " "));

        System.out.println();
        System.out.println("using take while");
    }


    public void findFirst() throws Exception
    {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        IntStream intStream = Arrays.stream(numbers);
        OptionalInt optionalInt = intStream.findFirst();
        if(optionalInt.isPresent())
            System.out.println(optionalInt.getAsInt());
        else
            System.out.println("Stream is empty!");

    }


    public void findAny() throws Exception
    {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 10};
        int i = Arrays.stream(numbers).filter(n -> n >= 5).findAny().orElse(-1);
        System.out.println(i);

    }


    public void allMatch() throws Exception
    {
        int[] even = {2, 4, 6, 8, 10};
        boolean result =  Arrays.stream(even).allMatch(n -> n >4);
        System.out.println("Are all elements higher than 4 : " + result);
    }


    public void anyMatch() throws Exception
    {
        int[] evenAndOneOdd = {2, 4, 6, 8, 10, 11};
        boolean match = Arrays.stream(evenAndOneOdd).anyMatch(n -> n < 7);
        System.out.println(match);
    }


    public static void main(String[] args) throws Exception
    {
        StreamsFiltering streamsFiltering = new StreamsFiltering();
        streamsFiltering.allMatch();
        streamsFiltering.dropWhile();
        streamsFiltering.takeWhile();
        streamsFiltering.findFirst();
        streamsFiltering.anyMatch();
        streamsFiltering.findAny();
    }
}




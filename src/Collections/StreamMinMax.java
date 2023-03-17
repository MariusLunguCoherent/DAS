package Collections;

import java.util.List;

public class StreamMinMax
{
    public void min() {
        List<Integer> numbers = List.of(1, 2, 3, 100, 23, 93, 99);
        Integer min = numbers.stream().min(Integer::compareTo).get();
        System.out.println(min);
    }



    public void max() {
        List<Integer> numbers = List.of(1, 2, 3, 100, 23, 93, 99);
        Integer max = numbers.stream().max(Integer::compareTo).get();
        System.out.println(max);
    }

    public static void main(String[] args)
    {
        StreamMinMax minMax = new StreamMinMax();
        minMax.max();
        minMax.min();
    }
}

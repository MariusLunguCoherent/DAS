package Collections;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Remove duplicates.
 * */
public class StreamsDistinctAndSets
{


    public void distinct() throws Exception {
        List<Integer> numbers = List.of(1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 9, 9, 9);
        List<Integer> list = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println(list);
    }

    //Remove duplicates from collection

    public void distinctWithSet() throws Exception {
        List<Integer> numbers = List.of(1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 9, 9, 9);
        Set<Integer> collectSet= numbers.stream().collect(Collectors.toSet());
        System.out.println(collectSet);
    }

    public static void main(String[] args) throws Exception
    {
        StreamsDistinctAndSets streamsDistinctAndSets = new StreamsDistinctAndSets();
        streamsDistinctAndSets.distinctWithSet();
        streamsDistinctAndSets.distinct();

    }
}

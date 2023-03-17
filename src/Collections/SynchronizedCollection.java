package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SynchronizedCollection
{
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>(Arrays.asList("Synchronized", "Collections", "In", "Java"));
        Collection<String> synchronizedCollection;
        synchronizedCollection = Collections.synchronizedCollection(stringList);

        System.out.println(synchronizedCollection);

    }
}

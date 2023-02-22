package Task2.SortedListStringUpperCase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortedString {
    public static void main(String[] args) {
        Stream<String> nameStream;
        nameStream = Stream.of("Anastasiia", "Grygoriy", "Amelia", "Boris", "Andrew", "Peter")
                .map(s -> s.toUpperCase())
                .sorted(Comparator.reverseOrder());

        List<String> sortedNames = nameStream.collect(Collectors.toList());
        System.out.println(sortedNames);
    }
}

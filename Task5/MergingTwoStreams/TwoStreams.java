package Task5.MergingTwoStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TwoStreams {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        List<T> firstList = first.collect(Collectors.toList());
        List<T> secondList = second.collect(Collectors.toList());

        int min = Math.min(firstList.size(), secondList.size());

        List<T> result = new ArrayList<>();
        for (int i = 0; i < min; i++) {
            result.add(firstList.get(i));
            result.add(secondList.get(i));
        }
        return result.stream();
    }

    public static void main(String[] args) {
        Stream<String> first = Stream.of("1", "2", "3", "4", "5", "6");
        try (Stream<String> second = Stream.of("Anastasiia", "Amelia", "Boris", "Andrew", "Peter")) {

            System.out.println(zip(first, second).collect(Collectors.toList()));
        }
    }
}
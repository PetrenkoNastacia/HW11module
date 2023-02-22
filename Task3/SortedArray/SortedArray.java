package Task3.SortedArray;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedArray {
    private static final String[] numbers = {"1, 2, 0", "4, 5"};

    public static void main(String[] args) {
        String string = String.join(", ", numbers);
        String[] clearNumbers = string.split(", ");
        List<Integer> clearSortedNumbers = Arrays.stream(clearNumbers)
                .map(s -> Integer.parseInt(s))
                .sorted()
                .collect(Collectors.toList());

        System.out.println(clearSortedNumbers);
    }
}

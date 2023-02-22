package Task1.OddNames;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OddNames {
    public static void main(String[] args) {
        Stream<String> nameStream;
        nameStream = Stream.of("1. Anastasiia", "2. Grygoriy", "3. Boris", "4. Andrew", "5. Peter", "6. Julia")
                .filter(s -> (s.charAt(0) % 2) != 0);
        List<String> oddNames = nameStream.collect(Collectors.toList());
        System.out.println(oddNames);
    }
}

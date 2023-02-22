package Task4.LinearCongruentGenerator;

import java.util.stream.Stream;
import static java.util.stream.Stream.*;

public class LinearCongruentGenerator {

    public static Stream<Long> linConGen(long a, long c, long m) {
        // x[n + 1] = 1 (a x[n] + c) % m      // formula
        Stream<Long> stream = iterate(5L, x -> ((a * x + c) % m));
        return stream.limit(100)
                .peek(System.out::println);
    }
}

package Task4.LinearCongruentGenerator;

import java.util.stream.Collectors;

public class MainLinConGen {
    public static void main(String[] args) {
        LinearCongruentGenerator
                .linConGen(25214903917L, 11L, (long) Math.pow(2,48))
                .collect(Collectors.toList());
    }
}

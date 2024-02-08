package Function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        // Skapar bara en lista med tio tal som exempel
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
        // Skapar en lambdafunktion och lägger den i variablen "addTen"
        //av typen Function<T, R>
        Function<Integer, Integer> addTen = number -> number + 10;

        // Använder addTen i en map metod
        List<Integer> newNumbers = numbers.stream()
                .map(addTen)
                .collect(Collectors.toList());
    }
}

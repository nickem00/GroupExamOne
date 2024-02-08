package Predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        // Skapar bara en lista med tio tal som exempel
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }

        // Skapar ett lambdauttryck som vi lägger i en variabel
        // av typen Predicate
        Predicate<Integer> isDivisibleByThree = a -> a % 3 == 0;

        // Streamar alla tal i listan, och applicerar vårt nya Predicate
        // som filter, och lägger till i en ny lista
        List<Integer> divisibleByThree = numbers.stream()
                .filter(isDivisibleByThree)
                .collect(Collectors.toList());
    }
}

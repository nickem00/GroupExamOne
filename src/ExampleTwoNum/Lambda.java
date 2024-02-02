package ExampleTwoNum;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            numbers.add(i);
        }
        // With Lambdas and Streams
        List<Integer> doubled = numbers.stream()
                .map(number -> number * 2)
                .toList();
        numbers.forEach(System.out::println);
    }
}

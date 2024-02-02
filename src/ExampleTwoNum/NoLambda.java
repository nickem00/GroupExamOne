package ExampleTwoNum;

import java.util.ArrayList;
import java.util.List;

public class NoLambda {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        List<Integer> doubledNumbers = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            numbers.add(i);
        }

        // Without lambdas
        /*for (int number : numbers) {
            number = number * 2;
            doubledNumbers.add(number);
        }
        doubledNumbers.forEach(System.out::println); */

        // With lambdas
        numbers.forEach(number -> doubledNumbers.add(number * 2));
        doubledNumbers.forEach(System.out::println);
    }
}

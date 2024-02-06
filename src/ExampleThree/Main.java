package ExampleThree;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main examples = new Main();
        List<Integer> numbersList = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            numbersList.add(i);
        }
        examples.showStreamsExample(numbersList);
        examples.showNormalExample(numbersList);
    }

    // Två exempel för att dubblera alla tal i en lista och
    // därefter addera varje tal som är delbart med 3 i en ny lista

    // Streams och Lambda-exempel
    public void showStreamsExample(List<Integer> numbersList) {
        long startTime = System.nanoTime();

        List<Integer> newList = numbersList.stream()
                .map(number -> number * 2)
                .filter(doubledNumber -> doubledNumber % 3 == 0)
                .toList();

        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.err.println("Streams and Lambdas   :  " + duration / 1000000.0 + "ms");
    }

    // Exempel med For-loop och If-sats
    public void showNormalExample(List<Integer> numberList) {
        long startTime = System.nanoTime();

        List<Integer> doubled = new ArrayList<>();
        for (Integer number : numberList) {
            doubled.add(number * 2);
        }
        List<Integer> newList = new ArrayList<>();
        for (Integer number : doubled) {
            if (number % 3 == 0) {
                newList.add(number);
            }
        }

        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.err.println("If and For-loops      :  " + duration / 1000000.0 + "ms");
    }
}

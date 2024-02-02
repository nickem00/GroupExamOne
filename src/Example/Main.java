package Example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.addAll(Arrays.asList(
                new Person("Bob", 23),
                new Person("Steve", 17),
                new Person("John", 19),
                new Person("Dave", 16)
        ));

        for (Person person : persons) {
            if (person.getAge() >= 18) {
                System.out.println(person.getName());
            }
        }
        persons.stream()
                .filter(person -> person.getAge() >= 18)
                .forEach(person -> System.out.println(person.getName()));
    }
}

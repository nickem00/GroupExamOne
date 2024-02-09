package JacbobExempel;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> numbersList = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            numbersList.add(i);

        }

        //Skapar en stream av numbersList
        List<Integer> evenNumbers = numbersList.stream()
                .filter(numbers -> numbers % 2 == 0) //Filtrerar bort udda tal
                .toList(); //skapar en lista med de jämna talen

        evenNumbers.forEach(System.out::println); //Skriver ut alla jämna tal
    }
}

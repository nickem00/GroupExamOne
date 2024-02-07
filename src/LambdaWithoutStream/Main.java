package LambdaWithoutStream;


// Skapar ett interface med en apply-metod
interface MathOperation {
    int apply(int a, int b);
}

public class Main {
    public static void main(String[] args) {
        // Definierar ett lambda-uttryck för multiplikation
        MathOperation multiply = (int a, int b) -> a * b;

        // Kör multiply på a och b (5 och 3)
        int result = multiply.apply(5, 3);
        System.out.println(result);
    }
}

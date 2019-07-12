package tech.kremer.fizzbuzz;

public class FizzBuzz {

    public String fizzBuzz(int value) {
        if (value < 1) {
            throw new IllegalArgumentException();
        }

        if (value % 5 == 0 && value % 7 == 0) {
            return "fizz buzz";
        }

        if (value % 5 == 0) {
            return "fizz";
        }

        if (value % 7 == 0) {
            return "buzz";
        }

        return String.valueOf(value);
    }
}

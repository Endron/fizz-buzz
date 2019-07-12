package tech.kremer.fizzbuzz;

public class FizzBuzz {

    public String fizzBuzz(int value) {
        if (value % 5 == 0) {
            return "fizz";
        }

        if (value % 7 == 0) {
            return "buzz";
        }

        return String.valueOf(value);
    }
}

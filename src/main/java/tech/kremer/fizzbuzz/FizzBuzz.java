package tech.kremer.fizzbuzz;

public class FizzBuzz {

    public String fizzBuzz(int value) {
        if (value % 5 == 0) {
            return "fizz";
        }

        return String.valueOf(value);
    }
}

package tech.kremer.fizzbuzz;

public class FizzBuzz {

    public String fizzBuzz(int value) {
        if (value < 1) {
            throw new IllegalArgumentException();
        }

        var dividableBy5 = (value % 5 == 0);
        var dividableBy7 = (value % 7 == 0);

        if (dividableBy5 && dividableBy7) {
            return "fizz buzz";
        }

        if (dividableBy5) {
            return "fizz";
        }

        if (dividableBy7) {
            return "buzz";
        }

        return String.valueOf(value);
    }
}

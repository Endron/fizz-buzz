package tech.kremer.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {

    private final FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    void fizzBuzz_one() {
        assertEquals("1", fizzBuzz.fizzBuzz(1));
    }
}

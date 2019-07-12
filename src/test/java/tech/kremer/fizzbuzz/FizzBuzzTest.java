package tech.kremer.fizzbuzz;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {

    private final FizzBuzz fizzBuzz = new FizzBuzz();

    @DisplayName("The original value is returned if the value is not dividable by 5 or 7")
    @ParameterizedTest(name = "for value = {arguments}")
    @ValueSource(ints = {1, 2, 3, 4, 6, 8, 9, 11, 12, 13, 16})
    void fizzBuzz_returnOriginalValue(int value) {
        assertEquals(String.valueOf(value), fizzBuzz.fizzBuzz(value));
    }
}

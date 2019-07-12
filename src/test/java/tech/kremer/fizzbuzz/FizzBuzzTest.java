package tech.kremer.fizzbuzz;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FizzBuzzTest {

    private final FizzBuzz fizzBuzz = new FizzBuzz();

    @DisplayName("The original value is returned if the value is not dividable by 5 or 7")
    @ParameterizedTest(name = "for value = {arguments}")
    @ValueSource(ints = {
            1,
            2,
            3,
            4,
            6,
            8,
            9,
            11,
            12,
            13,
            16,
            751
    })
    void fizzBuzz_returnOriginalValue(int value) {
        assertEquals(String.valueOf(value), fizzBuzz.fizzBuzz(value));
    }

    @DisplayName("'fizz' is returned if the value is dividable by 5 but not by 7")
    @ParameterizedTest(name = "for value = {arguments}")
    @ValueSource(ints = {
            5,
            2 * 5,
            3 * 5,
            4 * 5,
            5 * 5,
            6 * 5,
            8 * 5,
            9 * 5,
            10 * 5,
            11 * 5,
            12 * 5,
            13 * 5,
            15 * 5,
            128 * 5
    })
    void fizzBuzz_returnFizz(int value) {
        assertEquals("fizz", fizzBuzz.fizzBuzz(value));
    }

    @DisplayName("'buzz' is returned if the value is dividable by 7 but not by 5")
    @ParameterizedTest(name = "for value = {arguments}")
    @ValueSource(ints = {7, 14, 21, 42, 49, 56, 63, 77})
    void fizzBuzz_returnBuzz(int value) {
        assertEquals("buzz", fizzBuzz.fizzBuzz(value));
    }

    @DisplayName("'fizz buzz' is returned if the value is dividable by both 7 and 5")
    @ParameterizedTest(name = "for value = {arguments}")
    @ValueSource(ints = {
            5 * 7,
            2 * 5 * 7,
            3 * 5 * 7,
            4 * 5 * 7,
            5 * 5 * 7,
            6 * 5 * 7,
            238 * 5 * 7
    })
    void fizzBuzz_returnFizzBuzz(int value) {
        assertEquals("fizz buzz", fizzBuzz.fizzBuzz(value));
    }

    @DisplayName("'InvalidArgumentException' is thrown for values < 1")
    @ParameterizedTest(name = "for value = {arguments}")
    @ValueSource(ints = {
            0,
            -1,
            -2,
            -5,
            -7,
            -5 * 7,
            -32 * 5,
            -78 * 7,
            -1445886
    })
    void fizzBuzz_greaterZero(int value) {
        assertThrows(
                IllegalArgumentException.class,
                () -> fizzBuzz.fizzBuzz(value)
        );
    }
}

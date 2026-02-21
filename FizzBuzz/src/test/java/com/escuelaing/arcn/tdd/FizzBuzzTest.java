import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FizzBuzzTest {

    @Test
    void testFizzBuzzReturnsNumber() {
        assertEquals("1", FizzBuzz.fizzbuzz(1));
    }

    @Test
    void testFizzBuzzMultiplo3() {
        assertEquals("Fizz", FizzBuzz.fizzbuzz(3));
    }

    @Test
    void testFizzBuzzMultiplo5() {
        assertEquals("Buzz", FizzBuzz.fizzbuzz(5));
    }

    @Test
    void testFizzBuzzMultiplo3y5() {
        assertEquals("FizzBuzz", FizzBuzz.fizzbuzz(15));
    }

    @Test
    void testFizzBuzzZero() {
        assertEquals("FizzBuzz", FizzBuzz.fizzbuzz(0));
    }

    @Test
    void testFizzBuzzNegativeMultiplo3() {
        assertEquals("Fizz", FizzBuzz.fizzbuzz(-3));
    }

    @Test
    void testFizzBuzzNegativeMultiplo5() {
        assertEquals("Buzz", FizzBuzz.fizzbuzz(-5));
    }

    @ParameterizedTest
    @CsvSource({
        "2, 2",
        "4, 4",
        "6, Fizz",
        "10, Buzz",
        "30, FizzBuzz",
        "7, 7"
    })
    void testFizzBuzzMultipleValues(int input, String expected) {
        assertEquals(expected, FizzBuzz.fizzbuzz(input));
    }
}
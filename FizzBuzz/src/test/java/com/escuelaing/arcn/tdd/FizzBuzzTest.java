import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FizzBuzzTest {

    @Test
    void testFizzBuzzReturnsNumber() {
        // Arrange
        int input = 1;

        // Act
        String result = FizzBuzz.fizzbuzz(input);

        // Assert
        assertEquals("1", result);
    }

    @Test
    void testFizzBuzzMultiplo3() {
        // Arrange
        int input = 3;

        // Act
        String result = FizzBuzz.fizzbuzz(input);

        // Assert
        assertEquals("Fizz", result);
    }

    @Test
    void testFizzBuzzMultiplo5() {
        // Arrange
        int input = 5;

        // Act
        String result = FizzBuzz.fizzbuzz(input);

        // Assert
        assertEquals("Buzz", result);
    }

    @Test
    void testFizzBuzzMultiplo3y5() {
        // Arrange
        int input = 15;

        // Act
        String result = FizzBuzz.fizzbuzz(input);

        // Assert
        assertEquals("FizzBuzz", result);
    }

    @Test
    void testFizzBuzzZero() {
        // Arrange
        int input = 0;

        // Act
        String result = FizzBuzz.fizzbuzz(input);

        // Assert
        assertEquals("FizzBuzz", result);
    }

    @Test
    void testFizzBuzzNegativeMultiplo3() {
        // Arrange
        int input = -3;

        // Act
        String result = FizzBuzz.fizzbuzz(input);

        // Assert
        assertEquals("Fizz", result);
    }

    @Test
    void testFizzBuzzNegativeMultiplo5() {
        // Arrange
        int input = -5;

        // Act
        String result = FizzBuzz.fizzbuzz(input);

        // Assert
        assertEquals("Buzz", result);
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

        // Arrange
        int value = input;

        // Act
        String result = FizzBuzz.fizzbuzz(value);

        // Assert
        assertEquals(expected, result);
    }
}
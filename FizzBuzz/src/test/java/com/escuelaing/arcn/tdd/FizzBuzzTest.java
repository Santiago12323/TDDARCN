import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FizzBuzzTest {
    @ParameterizedTest
    @CsvSource({
        "1, 1",
        "3, Fizz",
        "5, Buzz",
        "15, FizzBuzz",
        "0, FizzBuzz",
        "-3, Fizz",
        "-5, Buzz"
    })
    void testFizzBuzzBasicCases(int input, String expected) {
        // Act
        String result = FizzBuzz.fizzbuzz(input);

        // Assert
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({
        "6, Fizz",    
        "10, Buzz",   
        "30, FizzBuzz", 
        "7, 7",     
        "-15, FizzBuzz", 
        "-7, -7"    
    })
    void testFizzBuzzAdditionalCases(int input, String expected) {
        // Arrange

        // Act
        String result = FizzBuzz.fizzbuzz(input);

        // Assert
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({
        "3, true",
        "5, true",
        "15, true",
        "7, false",
        "-3, true",
        "-5, true",
        "-7, false",
        "0, true"
    })
    void testIsMultipleOfIndirectly(int number, boolean expected) {
        // Act
        boolean isFizz = FizzBuzz.fizzbuzz(number).contains("Fizz");
        boolean isBuzz = FizzBuzz.fizzbuzz(number).contains("Buzz");

        // Assert
        if (number % 3 == 0) {
            assertTrue(isFizz);
        } else {
            assertFalse(isFizz);
        }

        if (number % 5 == 0) {
            assertTrue(isBuzz);
        } else {
            assertFalse(isBuzz);
        }
    }

    @Test
    void testFizzBuzzLargeNumber() {
        // Arrange
        int input = 9999990; 

        // Act
        String result = FizzBuzz.fizzbuzz(input);

        // Assert
        assertEquals("FizzBuzz", result);
    }
}
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void translateFizz() {
        int number = 21;

        String expected = "Fizz";
        String result = FizzBuzz.translate(number);
        assertEquals(expected, result);
    }

    @Test
    void translateBuzz() {
        int number = 25;

        String expected = "Buzz";
        String result = FizzBuzz.translate(number);
        assertEquals(expected, result);
    }
    @Test
    void translateFizzBuzz() {
        int number = 45;

        String expected = "FizzBuzz";
        String result = FizzBuzz.translate(number);
        assertEquals(expected, result);
    }

    @Test
    void includeFizz() {
        int number = 32;

        String expected = "Fizz";
        String result = FizzBuzz.translate(number);
        assertEquals(expected, result);
    }

    @Test
    void includeBuzz() {
        int number = 52;

        String expected = "Buzz";
        String result = FizzBuzz.translate(number);
        assertEquals(expected, result);
    }


}
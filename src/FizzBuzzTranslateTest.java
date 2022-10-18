import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateTest {

    @Test
    @DisplayName("nhap so nguyen > 0")
    void fizzBuzzTranslate0() {
        int integer = -1;

        String excepted = "nhap so nguyen > 0";
        String result = FizzBuzzTranslate.fizzBuzzTranslate(integer);
        assertEquals(excepted, result);
    }

    @Test
    @DisplayName("hien thi Fizz")
    void fizzBuzzTranslate1() {
        int integer = 3;

        String excepted = "Fizz";
        String result = FizzBuzzTranslate.fizzBuzzTranslate(integer);
        assertEquals(excepted, result);
    }
}
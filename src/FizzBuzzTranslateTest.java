import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateTest {

    @Test
    @DisplayName("nhap so nguyen > 0")
    void fizzBuzzTranslate0() {
        int n = -1;

        String excepted = "nhap so nguyen > 0";
        String result = FizzBuzzTranslate.fizzBuzzTranslate(n);
        assertEquals(excepted, result);
    }
}
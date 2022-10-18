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
    @Test
    @DisplayName("hien thi Buzz")
    void fizzBuzzTranslate2() {
        int integer = 5;

        String excepted = "Buzz";
        String result = FizzBuzzTranslate.fizzBuzzTranslate(integer);
        assertEquals(excepted, result);
    }

    @Test
    @DisplayName("hien thi FizzBuzz")
    void fizzBuzzTranslate3() {
        int integer = 15;

        String excepted = "FizzBuzz";
        String result = FizzBuzzTranslate.fizzBuzzTranslate(integer);
        assertEquals(excepted, result);
    }

    @Test
    @DisplayName("hien thi chuoi ban dau")
    void fizzBuzzTranslate4() {
        int integer = 2;

        String excepted = "2";
        String result = FizzBuzzTranslate.fizzBuzzTranslate(integer);
        assertEquals(excepted, result);
    }

    @Test
    @DisplayName("so chua so 3")
    void fizzBuzzTranslate5() {
        int integer = 13;

        String excepted = "Fizz";
        String result = FizzBuzzTranslate.fizzBuzzTranslate(integer);
        assertEquals(excepted, result);
    }

    @Test
    @DisplayName("so chua so 5")
    void fizzBuzzTranslate6() {
        int integer = 51;

        String excepted = "Fizz";
        String result = FizzBuzzTranslate.fizzBuzzTranslate(integer);
        assertEquals(excepted, result);
    }
    @Test
    @DisplayName("so khong chia het cho 3 va 5 co chua so 3")
    void fizzBuzzTranslate7() {
        int integer = 31;

        String excepted = "Fizz";
        String result = FizzBuzzTranslate.fizzBuzzTranslate(integer);
        assertEquals(excepted, result);
    }
}
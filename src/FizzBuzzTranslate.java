public class FizzBuzzTranslate {
    public static String fizzBuzzTranslate(int integer) {
        boolean divisibleBy3 = integer % 3 == 0;
        boolean divisibleBy5 = integer % 5 == 0;
        if (integer < 0) {
            return "nhap so nguyen > 0";
        } else {
            if (divisibleBy3 && divisibleBy5) {
                return "FizzBuzz";
            } else if (divisibleBy3) {
                return "Fizz";
            } else if (divisibleBy5) {
                    return "Buzz";
                } else {
                return String.valueOf(integer);
            }
        }
    }
}

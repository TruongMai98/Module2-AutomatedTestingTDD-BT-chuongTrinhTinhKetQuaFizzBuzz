public class FizzBuzzTranslate {
    public static String fizzBuzzTranslate(int integer) {
        boolean divisibleBy3 = integer % 3 == 0;
        if (integer < 0) {
            return "nhap so nguyen > 0";
        } else {
            if (divisibleBy3) {
                return "Fizz";
            } else if (integer % 5 ==0) {
                return "Buzz";
            }
        }
        return null;
    }
}

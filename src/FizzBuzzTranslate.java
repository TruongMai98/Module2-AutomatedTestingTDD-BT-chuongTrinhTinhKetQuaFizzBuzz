public class FizzBuzzTranslate {
    public static String fizzBuzzTranslate(int integer) {
        boolean divisibleBy3 = integer % 3 == 0;
        boolean divisibleBy5 = integer % 5 == 0;


        if (integer < 0) {
            return "nhap so nguyen > 0";
        } else {
            if (divisibleBy3 && divisibleBy5) {
                return "FizzBuzz";
            } else if (divisibleBy3 || hasNumber3(integer) == 1) {
                return "Fizz";
            } else if (divisibleBy5 || hasNumber5(integer) == 1 ) {
                    return "Buzz";
                } else {
                return String.valueOf(integer);
            }
        }
    }
    public static int hasNumber3(int integer) {
        String str = String.valueOf(integer);
        return str.indexOf("3");
    }

    public static int hasNumber5(int integer) {
        String str = String.valueOf(integer);
        return str.indexOf("5");
    }

}

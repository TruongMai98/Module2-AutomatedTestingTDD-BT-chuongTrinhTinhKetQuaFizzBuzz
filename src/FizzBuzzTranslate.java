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
                if (hasNumber3(integer) >= 0) {
                    return "Fizz";
                } else if (hasNumber5(integer) >= 0) {
                    return "Buzz";
                } else {
                    return String.valueOf(integer);
                }
            }
        }
    }
    public static String toWord(int integer) {
        int last = integer % 10; // lấy số cuối
        int second = (integer / 10) % 10; // lấy số thứ 2
        int secondAndLast = integer % 100; // lấy 2 số cuối
        int first = integer / 100; // lấy số đầu tiên
        String[] arrA = {" ", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
                "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String[] arrB = {" ", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        if (integer < 20) {
            return arrA[integer];
        } else if (integer < 100) {
            return arrB[second] + " " + arrA[last];
        }
        return null;
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

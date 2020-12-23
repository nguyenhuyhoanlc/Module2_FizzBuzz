public class FizzBuzz {
    public static String translate(int number) {
        String toString = "";
        boolean isFizzBuzz = (number % 3 == 0 && number % 5 == 0);
        boolean isFizz = (number % 3 == 0) || include3(number);
        boolean isBuzz = (number % 5 == 0) || include5(number);



        if (isFizzBuzz){
            toString = "FizzBuzz";
        } else if (isFizz){
            toString = "Fizz";
        } else  if (isBuzz){
            toString = "Buzz";
        }

        return toString;
    }

    private static boolean include3(int number) {
        boolean include3 = false;
        if ((number % 10) % 3 == 0) include3 = true;
        if ((number / 10) % 3 == 0) include3 = true;
        return include3;
    }
    private static boolean include5(int number) {
        boolean include3 = false;
        if ((number % 10) % 5 == 0) include3 = true;
        if ((number / 10) % 5 == 0) include3 = true;
        return include3;
    }

}

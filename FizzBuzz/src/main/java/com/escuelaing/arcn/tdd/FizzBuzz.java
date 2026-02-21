public final class FizzBuzz {

    private static final int FIZZ_DIVISOR = 3;
    private static final int BUZZ_DIVISOR = 5;

    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";


    public static String fizzbuzz(int number) {

        boolean isFizz = isMultipleOf(number, FIZZ_DIVISOR);
        boolean isBuzz = isMultipleOf(number, BUZZ_DIVISOR);

        if (isFizz && isBuzz) {
            return FIZZ + BUZZ;
        }

        if (isFizz) {
            return FIZZ;
        }

        if (isBuzz) {
            return BUZZ;
        }

        return String.valueOf(number);
    }

    private static boolean isMultipleOf(int number, int divisor) {
        return number % divisor == 0;
    }
}
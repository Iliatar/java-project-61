package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public final class PrimeGame {
    private static final int NUMBER_BOUND = 100;

    private static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void runGame() {
        String[][] questions = new String[Engine.ROUND_COUNT][2];

        for (String[] question : questions) {
            int number = Utils.generateNumber(NUMBER_BOUND) + 1;
            question[0] = Integer.valueOf(number).toString();
            question[1] = isPrime(number) ? "yes" : "no";
        }

        Engine.runGame(questions, DESCRIPTION);
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        boolean result = true;

        for (int j = 2; j <= number / 2; j++) {
            if (number % j == 0) {
                result = false;
                break;
            }
        }

        return result;
    }
}

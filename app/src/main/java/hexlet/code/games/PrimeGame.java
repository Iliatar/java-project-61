package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public final class PrimeGame {
    private static final int NUMBER_BOUND = 100;

    private static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void runGame() {
        String[] questions = new String[Engine.ROUND_COUNT];
        String[] answers = new String[Engine.ROUND_COUNT];

        for (int i = 0; i < Engine.ROUND_COUNT; i++) {
            int number = Utils.generateNumber(NUMBER_BOUND) + 1;
            questions[i] = Integer.valueOf(number).toString();
            answers[i] = isPrime(number) ? "yes" : "no";
        }

        Engine.runGame(new String[][]{questions, answers}, DESCRIPTION);
    }

    private static boolean isPrime(int number) {
        boolean result = true;

        for (int j = 2; j <= number / 2; j++) {
            if (number % j == 0) {
                result = false;
                break;
            }
        }

        return  result;
    }
}

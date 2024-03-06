package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public final class GCDGame {
    private static final int NUMBER_BOUND = 100;

    private static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";

    public static void runGame() {
        String[] questions = new String[Engine.ROUND_COUNT];
        String[] answers = new String[Engine.ROUND_COUNT];

        for (int i = 0; i < Engine.ROUND_COUNT; i++) {
            int number1 = Utils.generateNumber(NUMBER_BOUND);
            int number2 = Utils.generateNumber(NUMBER_BOUND);
            questions[i] = number1 + " " + number2;
            int answerNumber = number1 > number2 ? gcd(number1, number2) : gcd(number2, number1);
            answers[i] = Integer.valueOf(answerNumber).toString();
        }
        Engine.runGame(new String[][]{questions, answers}, DESCRIPTION);
    }

    private static int gcd(int number1, int number2) {
        if (number2 == 0) {
            return number1;
        }
        return gcd(number2, number1 % number2);
    }
}

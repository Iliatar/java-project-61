package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public final class GCDGame {
    private static final int NUMBER_BOUND = 100;

    private static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";

    public static void runGame() {
        String[][] questions = new String[Engine.ROUND_COUNT][2];

        for (String[] question : questions) {
            int number1 = Utils.generateNumber(NUMBER_BOUND);
            int number2 = Utils.generateNumber(NUMBER_BOUND);
            question[0] = number1 + " " + number2;
            int answerNumber = number1 > number2 ? gcd(number1, number2) : gcd(number2, number1);
            question[1] = Integer.valueOf(answerNumber).toString();
        }
        Engine.runGame(questions, DESCRIPTION);
    }

    private static int gcd(int number1, int number2) {
        if (number2 == 0) {
            return number1;
        }
        return gcd(number2, number1 % number2);
    }
}

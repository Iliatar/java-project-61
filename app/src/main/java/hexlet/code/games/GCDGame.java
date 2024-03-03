package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public final class GCDGame {
    private static final int NUMBER_BOUND = 100;

    private static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";

    public static void runGame() {
        int roundCount = Engine.getRoundCount();
        String[] questions = new String[roundCount];
        String[] answers = new String[roundCount];

        for (int i = 0; i < roundCount; i++) {
            int number1 = Utils.generateNumber(NUMBER_BOUND);
            int number2 = Utils.generateNumber(NUMBER_BOUND);
            questions[i] = number1 + " " + number2;
            int answerNumber = number1 > number2 ? getGCD(number1, number2) : getGCD(number2, number1);
            answers[i] = Integer.valueOf(answerNumber).toString();
        }
        Engine.runGame(new String[][]{questions, answers}, DESCRIPTION);
    }

    private static int getGCD(int number1, int number2) {
        if (number2 == 0) {
            return number1;
        }
        return getGCD(number2, number1 % number2);
    }
}

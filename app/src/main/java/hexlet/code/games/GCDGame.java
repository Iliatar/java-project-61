package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public final class GCDGame {
    private static final int NUMBER_BOUND = 100;

    private static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";

    public static void runGame() {
        int attempsCount = Engine.getRoundCount();
        Random random = new Random();
        String[] questions = new String[attempsCount];
        String[] answers = new String[attempsCount];

        for (int i = 0; i < attempsCount; i++) {
            int number1 = random.nextInt(NUMBER_BOUND);
            int number2 = random.nextInt(NUMBER_BOUND);
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

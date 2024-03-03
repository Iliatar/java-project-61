package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public final class PrimeGame {
    private static final int NUMBER_BOUND = 100;

    private static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void runGame(int attempsCount) {
        System.out.println();
        Random random = new Random();
        String[] questions = new String[attempsCount];
        String[] answers = new String[attempsCount];

        for (int i = 0; i < attempsCount; i++) {
            int number = random.nextInt(NUMBER_BOUND) + 1;
            questions[i] = Integer.valueOf(number).toString();
            answers[i] = "yes";

            for (int j = 2; j <= number / 2; j++) {
                if (number % j == 0) {
                    answers[i] = "no";
                    break;
                }
            }
        }
        Engine.runGame(new String[][]{questions, answers}, DESCRIPTION);
    }
}

package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public final class EvenGame {
    private static final int NUMBER_BOUND = 100;

    private static final String DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void runGame() {
        int roundCount = Engine.getRoundCount();
        Random random = new Random();
        String[] questions = new String[roundCount];
        String[] answers = new String[roundCount];

        for (int i = 0; i < roundCount; i++) {
            Integer number = random.nextInt(NUMBER_BOUND);
            questions[i] = number.toString();
            answers[i] = number % 2 == 0 ? "yes" : "no";
        }
        Engine.runGame(new String[][]{questions, answers}, DESCRIPTION);
    }
}

package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public final class EvenGame {
    private static final int NUMBER_BOUND = 100;

    private static final String DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void runGame() {
        String[] questions = new String[Engine.ROUND_COUNT];
        String[] answers = new String[Engine.ROUND_COUNT];

        for (int i = 0; i < Engine.ROUND_COUNT; i++) {
            Integer number = Utils.generateNumber(NUMBER_BOUND);
            questions[i] = number.toString();
            answers[i] = number % 2 == 0 ? "yes" : "no";
        }
        Engine.runGame(new String[][]{questions, answers}, DESCRIPTION);
    }
}

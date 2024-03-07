package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public final class EvenGame {
    private static final int NUMBER_BOUND = 100;

    private static final String DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void runGame() {
        String[][] questions = new String[Engine.ROUND_COUNT][2];

        for (String[] question : questions) {
            Integer number = Utils.generateNumber(NUMBER_BOUND);
            question[0] = number.toString();
            question[1] = number % 2 == 0 ? "yes" : "no";
        }
        Engine.runGame(questions, DESCRIPTION);
    }
}

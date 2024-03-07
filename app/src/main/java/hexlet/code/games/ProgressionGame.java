package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public final class ProgressionGame {
    private static final int K_BOUND = 15;
    private static final int B_BOUND = 50;
    private static final int MIN_LENGTH = 5;
    private static final int MAX_LENGTH = 12;

    private static final String DESCRIPTION = "What number is missing in the progression?";

    public static void runGame() {
        String[][] questions = new String[Engine.ROUND_COUNT][2];

        for (String[] question : questions) {
            int b = Utils.generateNumber(B_BOUND);
            int k = Utils.generateNumber(K_BOUND) + 1;
            int length = Utils.generateNumber(MIN_LENGTH, MAX_LENGTH);
            int questNumberIndex = Utils.generateNumber(length);

            String[] progressionArray = makeProgression(b, k, length);
            question[1] = progressionArray[questNumberIndex];
            progressionArray[questNumberIndex] = "..";
            question[0] = String.join(" ", progressionArray);
        }
        Engine.runGame(questions, DESCRIPTION);
    }

    private  static String[] makeProgression(int first, int step, int length) {
        String[] result = new String[length];

        for (int i = 0; i < length; i++) {
            int number = first + step * i;
            result[i] = Integer.valueOf(number).toString();
        }

        return  result;
    }
}

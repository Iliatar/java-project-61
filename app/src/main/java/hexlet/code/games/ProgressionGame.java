package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public final class ProgressionGame {
    private static final int K_BOUND = 15;
    private static final int B_BOUND = 50;
    private static final int MIN_LENGTH = 5;
    private static final int MAX_LENGTH = 12;

    private static final String DESCRIPTION = "What number is missing in the progression?";

    public static void runGame() {
        int roundCount = Engine.getRoundCount();
        Random random = new Random();
        String[] questions = new String[roundCount];
        String[] answers = new String[roundCount];

        for (int i = 0; i < roundCount; i++) {
            int b = random.nextInt(B_BOUND);
            int k = random.nextInt(K_BOUND) + 1;
            int length = MIN_LENGTH + random.nextInt(MAX_LENGTH - MIN_LENGTH);
            int questNumberIndex = random.nextInt(length);

            String[] progressionArray = makeProgression(b, k, length);
            answers[i] = progressionArray[questNumberIndex];
            progressionArray[questNumberIndex] = "..";
            questions[i] = String.join(" ", progressionArray);
        }
        Engine.runGame(new String[][]{questions, answers}, DESCRIPTION);
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

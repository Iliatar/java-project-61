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

            questions[i] = calcProgression(b, k, length, questNumberIndex);
            int answerNumber = k * questNumberIndex + b;
            answers[i] = Integer.valueOf(answerNumber).toString();


        }
        Engine.runGame(new String[][]{questions, answers}, DESCRIPTION);
    }

    private  static String calcProgression(int b, int k, int length, int questNumberIndex) {
        StringBuilder builder = new StringBuilder();

        for (int j = 0; j < length; j++) {
            int number = k * j + b;

            if (j > 0) {
                builder.append(" ");
            }

            if (j == questNumberIndex) {
                builder.append("..");
            } else {
                builder.append(number);
            }
        }

        return builder.toString();
    }
}

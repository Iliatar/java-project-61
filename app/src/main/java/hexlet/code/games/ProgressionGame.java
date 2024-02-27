package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public final class ProgressionGame {
    private static final int K_BOUND = 15;
    private static final int B_BOUND = 50;
    private static final int MIN_LENGTH = 5;
    private static final int MAX_LENGTH = 12;

    public static void runGame(int attempsCount) {
        System.out.println("What number is missing in the progression?");
        Random random = new Random();
        String[] questions = new String[attempsCount];
        String[] answers = new String[attempsCount];

        for (int i = 0; i < attempsCount; i++) {
            int b = random.nextInt(B_BOUND);
            int k = random.nextInt(K_BOUND) + 1;
            int length = MIN_LENGTH + random.nextInt(MAX_LENGTH - MIN_LENGTH);
            int questNumberIndex = random.nextInt(length);

            StringBuilder builder = new StringBuilder();

            for (int j = 0; j < length; j++) {
                int number = k * j + b;

                if (j > 0) {
                    builder.append(" ");
                }

                if (j == questNumberIndex) {
                    builder.append("..");
                    answers[i] = Integer.valueOf(number).toString();
                } else {
                    builder.append(number);
                }
            }

            questions[i] = builder.toString();
        }
        Engine.runGame(questions, answers);
    }
}

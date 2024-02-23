package hexlet.code.games;

import hexlet.code.MindGame;

import java.util.Random;

public final class ProgressionGame  implements MindGame {
    private final static int B_BOUND = 50;
    private final static int K_BOUND = 15;
    private final static int MIN_LENGTH = 5;
    private final static int MAX_LENGTH = 12;
    private String question;
    private String answer;
    private Random random;

    public ProgressionGame() {
        random = new Random();
    }

    public String getIntro() {
        return "What number is missing in the progression?";
    }

    public void nextQuestion() {
        int b = random.nextInt(B_BOUND);
        int k = random.nextInt(K_BOUND) + 1;
        int length = MIN_LENGTH + random.nextInt(MAX_LENGTH - MIN_LENGTH);
        int questNumberIndex = random.nextInt(length);

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int number = k * i + b;

            if (i > 0) {
                builder.append(" ");
            }

            if (i == questNumberIndex) {
                builder.append("..");
                answer = Integer.valueOf(number).toString();
            } else {
                builder.append(number);
            }
        }

        question = builder.toString();
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }
}

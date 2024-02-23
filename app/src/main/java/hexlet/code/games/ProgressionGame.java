package hexlet.code.games;

import hexlet.code.MindGame;

import java.util.Random;

public final class ProgressionGame  implements MindGame {
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
        int bBound = 50;
        int kBound = 15;
        int minimalLenght = 5;
        int maximalLenght = 12;
        int b = random.nextInt(bBound);
        int k = random.nextInt(kBound) + 1;
        int length = minimalLenght + random.nextInt(maximalLenght - minimalLenght);
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

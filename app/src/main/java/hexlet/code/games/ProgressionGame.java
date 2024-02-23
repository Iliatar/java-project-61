package hexlet.code.games;

import hexlet.code.MindGame;

import java.util.Random;

public class ProgressionGame  implements MindGame {
    String question;
    String answer;
    Random random;

    public ProgressionGame() {
        random = new Random();
    }

    public String getIntro() {
        return "What number is missing in the progression?";
    }

    public void nextQuestion() {
        int b = random.nextInt(50);
        int k = random.nextInt(15) + 1;
        int length = 5 + random.nextInt(7);
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

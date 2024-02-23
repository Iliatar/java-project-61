package hexlet.code.games;

import hexlet.code.MindGame;

import java.util.Random;

public final class EvenGame implements MindGame {
    private final static int NUMBER_BOUND = 100;
    private String question;
    private String answer;
    private Random random;

    public EvenGame() {
        random = new Random();
    }

    public String getIntro() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    public void nextQuestion() {
        Integer number = random.nextInt(NUMBER_BOUND);
        question = number.toString();
        answer = number % 2 == 0 ? "yes" : "no";
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }
}
